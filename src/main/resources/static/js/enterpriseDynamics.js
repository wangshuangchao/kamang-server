layui.config({
    base : "/js/"
}).use(['form','layer','jquery','laypage'],function(){
    var form = layui.form(),
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        laypage = layui.laypage,
        $ = layui.jquery,
        m;
    //加载页面数据
    var newsData = '';
    $.get("/app/management/dynamic/getAll", function(data){
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
                if(newsData[i].dynamicId == _this.attr("data-id")){
                    newsData.splice(i,1);
                    newsList(newsData);
                }
            }
            removeId =_this.parents("tr").find("td").eq(1).attr("id");

            //删除
             $.ajax({
                 type: "POST",
                 url: "/app/management/dynamic/deleteDynamic",
                 data: "dynamicId="+removeId,
                 success:function(){
                    console.log('成功')
                 },
                 error:function(){
                     console.log('失败')
                 }
             });
             console.log(removeId);
            layer.close(index);
        });
    })
    //修改
    $("body").on("click",".news_modify",function(){
        var _this = $(this),
            dynamicIdm,//id
            dynamicTitlem,//标题
            modiftContenm,//内容
            titleTypem,//类型
            contentTypem,//分类
            productIdm,//产品ID
            cardIdm;//名片ID;
        layer.confirm('确定修改此信息？',{icon:3, title:'提示信息'},function(index){
            dynamicIdm =_this.parents("tr").children().eq(1).attr("id");
            dynamicTitlem= _this.parents("tr").children().eq(2).text();
            modiftContenm = _this.parents("tr").children().eq(3).text();
            titleTypem =_this.parents("tr").children().eq(4).text();
            contentTypem=_this.parents("tr").children().eq(5).text();
            productIdm =_this.parents("tr").children().eq(6).text();
            cardIdm =_this.parents("tr").children().eq(7).text();
            $.ajax({
                type: "POST",
                url: "/app/management/dynamic/updateDynamic",
                data: {
                    dynamicId:dynamicIdm,
                    dynamicTitle:dynamicTitlem,
                    dynamicContent:modiftContenm,
                    titleType:titleTypem,
                    contentType:contentTypem,
                    productId:productIdm,
                    cardId:cardIdm
                },
                success:function(){
                     newsList();
                },
                error:function(){
                    console.log('失败')
                }
            });
            parent.location.reload();
            layer.close(index);
        });
    });
    //添加
    $(".dynamicsAdd_btn").click(function(){
        $(".addDyamicsDiv").show('1');
    });
    $("#dynamicsBtn").click(function(){//发布
        $(".addDyamicsDiv").show('1');
        var addDynamicTitle,//标题
            addDynamicContent,//内容
            addTitleType,//类型
            addContentType,//分类
            addProductId,//产品ID
            addCardId;//名片ID
        addDynamicTitle =$(".addDynamicTitle input:radio:checked").val();
        addDynamicContent =$("#dynamicContent").val();
        addTitleType =$(".titleType input:radio:checked").val();
        addContentType=$(".contentType input:radio:checked").val();
        addProductId =$("#productId").val();
        addCardId =$("#cardId").val();
        if(addDynamicTitle ==''){
            layer.msg('必须输入标题',{time:false,shade:0.1,shadeClose:true});
            return
        }
        if(addDynamicContent ==''){
            layer.msg('必须输入内容',{time:false,shade:0.1,shadeClose:true});
            return
        }
        if(addProductId ==''){
            layer.msg('必须输入产品ID',{time:false,shade:0.1,shadeClose:true});
            return
        }
        if(addCardId ==''){
            layer.msg('必须输入内容名片ID',{time:false,shade:0.1,shadeClose:true});
            return
        }
        //上传
        $.ajax({
            type: "POST",
            url: "/app/management/dynamic/addDynamic",
            data: {
                dynamicTitle:addDynamicTitle,
                dynamicContent:addDynamicContent,
                titleType :addTitleType,
                contentType:addContentType,
                productId:addProductId,
                cardId:addCardId
            },
            success:function(){
                console.log('成功')
            },
            error:function(){
                console.log('失败')
            }
        });
        $(".addDyamicsDiv").hide();
        parent.location.reload();
    })
    //关闭添加
    $("#closeDivIcon").click(function(){
        $(".addDyamicsDiv").hide();
    })
    //查询
    $(".search_btn").click(function(){
        var newArray = [];
        if($(".search_input").val() != ''){
            var index = layer.msg('查询中，请稍候',{icon: 16,time:false,shade:0.8});
            setTimeout(function(){
                $.ajax({
                    url : "/app/management/dynamic/getAll",
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
                            //标题
                            if(newsStr.dynamicTitle.indexOf(selectStr) > -1){
                                newsStr["dynamicTitle"] = changeStr(newsStr.dynamicTitle);
                            }
                            //类型
                            if(newsStr.titleType.indexOf(selectStr) > -1){
                                newsStr["titleType"] = changeStr(newsStr.titleType);
                            }
                            if(newsStr.dynamicTitle.indexOf(selectStr) > -1 || newsStr.titleType.indexOf(selectStr) > -1){
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
    //批量删除
    $(".batchDel").click(function(){
        var $checkbox = $('.enterprise_list tbody input[type="checkbox"][name="checked"]'),
            $checked = $('.enterprise_list tbody input[type="checkbox"][name="checked"]:checked'),
            removeIds =[];
        if($checkbox.is(":checked")){
            layer.confirm('确定删除选中的信息？',{icon:3, title:'提示信息'},function(index){
                var index = layer.msg('删除中，请稍候',{icon: 16,time:false,shade:0.8});
                setTimeout(function(){
                    //删除数据
                   // debugger
                    for(var j=0;j<$checked.length;j++){
                        for(var i=0;i<newsData.length;i++){
                            if(newsData[i].dynamicId == $checked.eq(j).parents("tr").find(".news_del").attr("data-id")){
                                removeIds.push(newsData[i].dynamicId)
                                newsData.splice(i,1);
                                newsList(newsData);
                            }
                        }
                    }
                    console.log(removeIds)
                    //删除
                    $.ajax({
                        type: "POST",
                        url: "/app/management/dynamic/deleteDynamics",
                        data: "dynamicIds="+removeIds
                    });
                    $('.enterprise_list thead input[type="checkbox"]').prop("checked",false);
                    form.render();
                    layer.close(index);
                    layer.msg("删除成功");
                },2000);
            })
        }else{
            layer.msg("请选择需要删除的列表");
        }
    })
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
                        +'<td align="left" id="'+currData[i].dynamicId +'">'+m+'</td>'//编号
                        +'<td contentEditable="true">'+currData[i].dynamicTitle+'</td>'
                        +'<td contentEditable="true">'+currData[i].dynamicContent+'</td>'
                        +'<td contentEditable="true">'+currData[i].titleType+'</td>'
                        +'<td contentEditable="true">'+currData[i].contentType+'</td>'
                        +'<td contentEditable="true">'+ currData[i].productId+'</td>'
                        +'<td contentEditable="true">'+ currData[i].cardId+'</td>'
                        +'<td>'
                            +'<a class="layui-btn  layui-btn-mini news_modify" data-id="'+data[i].dynamicId+'"><i class="layui-icon">&#xe642;</i> 修改</a>'
                            +'<a class="layui-btn layui-btn-danger layui-btn-mini news_del" data-id="'+data[i].dynamicId+'"><i class="layui-icon">&#xe640;</i> 删除</a>'
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
                $(".enterprise_content").html(renderDate(newsData,obj.curr));
                $('.enterprise_list thead input[type="checkbox"]').prop("checked",false);
                form.render();
            }
        })
    }
})
