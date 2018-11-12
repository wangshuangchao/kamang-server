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
    $.get("/mgshop/order/getAllOrder", function(data){
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
    });
    //删除
    // $("body").on("click",".news_del",function(){
    //     var _this = $(this),
    //         removeId='';
    //     layer.confirm('确定删除此信息？',{icon:3, title:'提示信息'},function(index){
    //         _this.parents("tr").remove();
    //         for(var i=0;i<newsData.length;i++){
    //             if(newsData[i].id == _this.attr("data-id")){
    //                 newsData.splice(i,1);
    //                 newsList(newsData);
    //             }
    //         }
    //         removeId =_this.parents("tr").find("td").eq(1).attr("id");
    //         console.log(removeId)
    //         //删除
    //          $.ajax({
    //              type: "POST",
    //              url: " http://192.168.0.110:9000/app/management/product/deleteProduct",
    //              data: "id="+removeId
    //          });
    //         layer.close(index);
    //     });
    // })
    //查询
    $(".search_btn").click(function(){
        var newArray = [];
        if($(".search_input").val() != ''){
            var index = layer.msg('查询中，请稍候',{icon: 16,time:false,shade:0.8});
            setTimeout(function(){
                $.ajax({
                    url : "/mgshop/order/getAllOrder",
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
                            //联系人
                            if(newsStr.receiver.indexOf(selectStr) > -1){
                                newsStr["receiver"] = changeStr(newsStr.receiver);
                            }
                            //电话
                            if(newsStr.receiverPhone.indexOf(selectStr) > -1){
                                newsStr["receiverPhone"] = changeStr(newsStr.receiverPhone);
                            }
                            if(newsStr.receiver.indexOf(selectStr) > -1 || newsStr.receiverPhone.indexOf(selectStr) > -1){
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
    });
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
            if(currData.length != 0){
                for(var i=0;i<currData.length;i++){
                    m++
                    dataHtml += '<tr>'
                        +'<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose"></td>'
                        +'<td align="left" id="'+currData[i].id +'">'+currData[i].id +'</td>'//编号
                        +'<td>'+fmtDate(currData[i].createTime)+'</td>'//时间
                        +'<td>'+currData[i].goodsName+'</td>'//名称
                        +'<td>'+currData[i].goodsNum +'</td>'//数量
                        +'<td>'+currData[i].totalFee +'</td>'//总金额
                        +'<td>'+currData[i].receiver +'</td>'//联系人
                        +'<td>'+currData[i].receiverPhone +'</td>'//联系人电话
                        +'<td>'+currData[i].receiverAddress +'</td>'//收件地址
                    if(currData[i].payStatus == "0"){
                        dataHtml += '<td style="color: red">未付款</td>';
                    }else{
                        dataHtml += '<td style="color: green">已付款</td>'
                    }
                    dataHtml+="</tr>";
                    // dataHtml +=
                    //     '<td>'
                    //         +'<a class="layui-btn layui-btn-danger layui-btn-mini news_del" data-id="'+currData[i].id+'"><i class="layui-icon">&#xe640;</i> 删除</a>'
                    //     +'</td>'
                    //     +'</tr>';
                }
            }else{
                dataHtml = '<tr><td colspan="10">暂无数据</td></tr>';
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
                $('.links_list thead input[type="checkbox"]').prop("checked",false);
                form.render();
            }
        })
    }
})
