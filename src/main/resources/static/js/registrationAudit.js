layui.config({
	base : "/js/"
}).use(['form','layer','jquery','laypage'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,
		$ = layui.jquery,
        m;
	//加载页面数据
    //http://192.168.1.110:9000/app/management/getAll
    var newsData = '';
    $.get("/app/management/getAll", function(data){
            newsData = data;
            if(window.sessionStorage.getItem("addNews")){
                var addNews = window.sessionStorage.getItem("addNews");
                newsData = JSON.parse(addNews).concat(newsData);
            }
            //执行加载数据的方法
            newsList();
    })
	//全选
	form.on('checkbox(allChoose)', function(data){
		var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"])');
		child.each(function(index, item){
			item.checked = data.elem.checked;
		});
		form.render('checkbox');
	});

	//通过判断列表是否全部选中来确定全选按钮是否选中
	form.on("checkbox(choose)",function(data){
		var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"])');
		var childChecked = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"]):checked')
		if(childChecked.length == child.length){
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = true;
		}else{
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = false;
		}
		form.render('checkbox');
	})
    //删除
    $("body").on("click",".news_del",function(){
        var _this = $(this),
            removeId='';
        layer.confirm('确定删除此信息？',{icon:3, title:'提示信息'},function(index){
            _this.parents("tr").remove();
            for(var i=0;i<newsData.length;i++){
                if(newsData[i].id == _this.attr("data-id")){
                    newsData.splice(i,1);
                    newsList(newsData);
                }
            }
            removeId =_this.parents("tr").find("td").eq(1).attr("id");
            //删除
             $.ajax({
                 type: "POST",
                 url: "/app/management/deleteUser",
                 data: "id="+removeId
             });
            layer.close(index);
        });
    })
    //查询
    $(".search_btn").click(function(){
        var newArray = [];
        if($(".search_input").val() != ''){
            var index = layer.msg('查询中，请稍候',{icon: 16,time:false,shade:0.8});
            setTimeout(function(){
                $.ajax({
                    url : "/app/management/getAll",
                    type : "get",
                    dataType : "json",
                    success : function(data){
                        if(window.sessionStorage.getItem("addNews")){
                            var addNews = window.sessionStorage.getItem("addNews");
                            newsData = JSON.parse(addNews).concat(data);
                        }else{
                            newsData = data;
                        }
                        for(var i=0;i<newsData.length;i++){
                            var newsStr = newsData[i];
                            var selectStr = $(".search_input").val();
                            function changeStr(data){
                                var dataStr = '';
                                var showNum = data.split(eval("/"+selectStr+"/ig")).length - 1;
                                if(showNum > 1){
                                    for (var j=0;j<showNum;j++) {
                                        dataStr += data.split(eval("/"+selectStr+"/ig"))[j] + "<i style='color:#03c339;font-weight:bold;'>" + selectStr + "</i>";
                                    }
                                    dataStr += data.split(eval("/"+selectStr+"/ig"))[showNum];
                                    return dataStr;
                                }else{
                                    dataStr = data.split(eval("/"+selectStr+"/ig"))[0] + "<i style='color:#03c339;font-weight:bold;'>" + selectStr + "</i>" + data.split(eval("/"+selectStr+"/ig"))[1];
                                    return dataStr;
                                }
                            }
                            //公司名称
                            if(newsStr.company.indexOf(selectStr) > -1){
                                newsStr["company"] = changeStr(newsStr.company);
                            }
                            //联系方式
                            if(newsStr.userPhone.indexOf(selectStr) > -1){
                                newsStr["userPhone"] = changeStr(newsStr.userPhone);
                            }
                            if(newsStr.company.indexOf(selectStr) > -1 || newsStr.userPhone.indexOf(selectStr) > -1){
                                newArray.push(newsStr);
                            }
                        }
                        newsData = newArray;
                        newsList(newsData);
                    }
                })
                layer.close(index);
            },2000);
        }else{
            layer.msg("请输入需要查询的内容");
        }
    })
    //详情关闭
    $("body").on("click",".closeBtn",function(){
        $(this).parent(".detailsListDiv").hide();
        $(this).parents(".detailsListDiv").find(".headerTop video").trigger('pause');
    })
    //详情
    $("body").on("click",".detailsList",function(){
           $(this).parents('td').find(".detailsListDiv").show();
    })

    //批量删除
    $(".batchDel").click(function(){
        var $checkbox = $('.news_list tbody input[type="checkbox"][name="checked"]'),
            $checked = $('.news_list tbody input[type="checkbox"][name="checked"]:checked'),
            removeIds =[];
        if($checkbox.is(":checked")){
            layer.confirm('确定删除选中的信息？',{icon:3, title:'提示信息'},function(index){
                var index = layer.msg('删除中，请稍候',{icon: 16,time:false,shade:0.8});
                setTimeout(function(){
                    //删除数据
                    for(var j=0;j<$checked.length;j++){
                        for(var i=0;i<newsData.length;i++){
                            if(newsData[i].id == $checked.eq(j).parents("tr").find(".news_del").attr("data-id")){
                                removeIds.push(newsData[i].id)
                                newsData.splice(i,1);
                                newsList(newsData);
                            }
                        }
                    }
                    //删除
                     $.ajax({
                         type: "POST",
                         url: "/app/management/deleteUsers",
                         data: "ids="+removeIds
                     });

                    $('.news_list thead input[type="checkbox"]').prop("checked",false);
                    form.render();
                    layer.close(index);
                    layer.msg("删除成功");
                },2000);
            })
        }else{
            layer.msg("请选择需要删除的列表");
        }
    })

    //认证
    $("body").on("click",".ToExamine",function(){
        var listNum =$(this).parents("tr").find("td").eq(1).attr("id"),
            $this = $(this),
            $listId;
        if($(this).hasClass("layui-form-onswitch")){
            //取消认证
            layer.confirm('确定修改认证？',{icon:3, title:'提示信息'},function(index){
                var index = layer.msg('修改中，请稍候',{icon: 16,time:false,shade:0.8});
                setTimeout(function(){
                    layer.close(index);
                    layer.msg("修改认证状态成功！");
                    $this.removeClass("layui-form-onswitch");
                    $this.find('em').html("否");
                    $this.attr("listId",'0');
                    $listId =$this.attr("listId");
                    $this.parent("td").prev("td").css("color","red");
                    $this.parent("td").prev("td").text("待审核");
                    $.ajax({
                        type: "POST",
                        url: "/app/management/updataStatus",
                        data: {'id':listNum,'isCentification':$listId}
                    });
                },1500);
            });
        }else{
            layer.confirm('确定修改认证？',{icon:3, title:'提示信息'},function(index){
                var index = layer.msg('修改中，请稍候',{icon: 16,time:false,shade:0.8});
                setTimeout(function(){
                    layer.close(index);
                    layer.msg("认证状态修改成功！");
                    $this.addClass("layui-form-onswitch");
                    $this.find('em').html("是");
                    $this.attr("listId",'1');
                    $listId =$this.attr("listId");
                    $this.parent("td").prev("td").css("color","#000000");
                    $this.parent("td").prev("td").text("已审核");
                    $.ajax({
                        type: "POST",
                        url: "/app/management/updataStatus",
                        data: {'id':listNum,'isCentification':$listId}
                    });
                },1500);
            });
        }
    })
    //时间戳转换
    function fmtDate(obj){
	    var date =  new Date(obj);
	    var y = 1900+date.getYear();
	    var m = "0"+(date.getMonth()+1);
	    var d = "0"+date.getDate();
	    return y+"-"+m.substring(m.length-2,m.length)+"-"+d.substring(d.length-2,d.length);
	}
    //渲染数据方法
	function newsList(that){
		//渲染数据
		function renderDate(data,curr){
			var dataHtml = '';
			if(!that){
            	currData = newsData.concat().splice(curr*nums-nums, nums);
            }else{
            	currData = that.concat().splice(curr*nums-nums, nums);
            }
            var listNumber =newsData.concat().splice(curr*nums-nums);//编号
            for( m=0;m<listNumber;m++){
                return m;
            }
			if(currData.length != 0){
				for(var i=0;i<currData.length;i++){
                    m++
					dataHtml += '<tr>'
			    	+'<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose"></td>'
			    	+'<td align="left" id="'+currData[i].id +'">'+m+'</td>'//编号
			    	+'<td>'+currData[i].company+'</td>'
                    +'<td><div class="businessLicDiv"><img src="'+currData[i].businessLicensePhotoUrl+'"</div></td>'
                    +'<td><div class="legalPersonID"><div><img src="'+currData[i].legalPersonPhotoUrl+'"></div><div style="margin-left:10px;"><img src="'+currData[i].ext+'" alt=""></div></div></td>'
                    +'<td>'+currData[i].userPhone+'</td>';
			    	if(currData[i].isCentification == "0" || currData[i].isCentification == "2" ||currData[i].isCentification == "3"){
			    		dataHtml +=
                            '<td style="color:#f00">待审核</td>'
                            +'<td><div class="layui-unselect layui-form-switch ToExamine" listId="'+ currData[i].isCentification+'" lay-skin="_switch" lay-skin="switch" ><em>否</em><i></i></div></td>';
			    	}else{
			    		dataHtml +=
                            '<td>已审核</td>'
                            +'<td><div class="layui-unselect layui-form-switch layui-form-onswitch ToExamine" lay-skin="_switch"><em>是</em><i></i></div></td>';
			    	}
			    	dataHtml +=
			    	'<td>'+fmtDate(currData[i].createTime)+'</td>'
			    	+'<td>'
                    +  '<a class="layui-btn layui-bg-blue layui-btn-mini detailsList"><i class="layui-icon">&#xe60b;</i> 详情</a>'
                    +  '<div class="detailsListDiv"><span class="closeBtn layui-icon clearfix">&#x1006;</span>'
                            +' <div class="headerTop">'
                                +'<video controls="controls" width="1000" height="368" class="videos"><source src="'+currData[i].companyVidio +'" type="video/mp4"></video>'
                        +'</div>'
                        +'<div class="imgMassige">'
                            +'<ul>'
                                +'<li><img src="'+currData[i].businessLicensePhotoUrl+'"></li>'
                                +'<li><img src="'+currData[i].legalPersonPhotoUrl+'"></li>'
                                +'<li><img src="'+currData[i].ext+'"></li>'
                             +'</ul>'
                        +'</div>'
                        +'<div class="businessMassige">'
                            +'<dl>'
                                +'<dt class="title"><i></i>工商信息</dt>'
                                +'<dd><span class="spanText">统一社会信用代码：</span><span>'+ currData[i].organizationCode+'</span></dd>'
                                +'<dd><span class="spanText">法定代表人：</span><span>'+ currData[i].legalPersonName+'</span></dd>'
                                +'<dd><span class="spanText">注册资本：</span><span>'+ currData[i].registeredAssets+'</span></dd>'
                                +'<dd><span class="spanText">成立时间：</span><span>'+fmtDate(currData[i].createTime)+'</span></dd>'
                                +'<dd><span class="spanText">注册地址:</span><span>'+ currData[i].companyAddr+'</span></dd>'
                            +'</dl>'
                            +'<p class=""><i></i></p>'
                        +'</div>'
                        +'<div class="companyMassige">'
                            +'<p class="companySize"><i></i>公司简介</p>'
                            +'<div class="briefIntroduction">'
                                +'<em>'+ currData[i].company+'</em>'
                                +'<p>'
                                    +currData[i].introduceCompany
                                +'</p>'
                            +'</div>'
                        +'</div>'
                    +'</div>'
					+'<a class="layui-btn layui-btn-danger layui-btn-mini news_del" data-id="'+data[i].id+'"><i class="layui-icon">&#xe640;</i> 删除</a>'
			        +'</td>'
			    	+'</tr>';
				}
			}else{
				dataHtml = '<tr><td colspan="8">暂无数据</td></tr>';
			}
		    return dataHtml;
		}
		//分页
		var nums = 10; //每页出现的数据量
		if(that){
			newsData = that;
		}
		laypage({

			cont : "page",
			pages : Math.ceil(newsData.length/nums),
			jump : function(obj){
				$(".news_content").html(renderDate(newsData,obj.curr));
				$('.news_list thead input[type="checkbox"]').prop("checked",false);
		    	form.render();
			}
		})
	}
})
