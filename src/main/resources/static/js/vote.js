
$(function() {
//	 var timestamp=new Date().getTime();
//     //随机串
//     function randomString(len) {
//         len = len || 32;
//         var $chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678';
//         var maxPos = $chars.length;
//         var pwd = '';
//         for (i = 0; i < len; i++) {
//             pwd += $chars.charAt(Math.floor(Math.random() * maxPos));
//         }
//         return pwd;
//     };
//     var tokenSpan =$(".tokenSpan").html();
//     var $getUrl ="'https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token='+tokenSpan+'&type=jsapi'";
//     var tickes="";
//     $.get("$getUrl",function(ticket){
//         tickes ==ticket;
//     })
//     console.log(timestamp);
//     wx.config({
//         debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
//         appId: 'wx091dbc466117e559', // 必填，公众号的唯一标识
//         timestamp: timestamp, // 必填，生成签名的时间戳
//         nonceStr: randomString(32), // 必填，生成签名的随机串
//         signature: tickes,// 必填，签名，见附录1
//         jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
//     });
//     wx.ready(function() {
//         //分享到朋友圈
//         wx.onMenuShareTimeline({
//             title: '标题', // 分享标题
//             link: '', // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
//             imgUrl:, // 分享图标
//             success: function() {
//                 // 用户确认分享后执行的回调函数
//             },
//             cancel: function() {
//                 // 用户取消分享后执行的回调函数
//             }
//         });
//         // 分享给朋友
//         wx.onMenuShareAppMessage({
//             title: '标题', // 分享标题
//             desc: '描述', // 分享描述
//             link: '', // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
//             imgUrl:, // 分享图标
//             type: '', // 分享类型,music、video或link，不填默认为link
//             dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
//             success: function() {
//                 // 用户确认分享后执行的回调函数
//             },
//             cancel: function() {
//                 // 用户取消分享后执行的回调函数
//             }
//         });
//     });
//	
	var openid=$(".openidSpan").html();
	$(".tipsDiv").click(function() {
		$(this).hide();
	});
	$(".choiceSpan").click(function() {
		$(this).toggleClass('voteColor');
	});
	$("input[type=submit]").on("click", function() {
		var voteNumbers = $(".voteColor");
		var numberId =$(".voteColor").siblings("p.numberId").html();
		if (voteNumbers.length > 1) {
			$(".tipsDiv").html("小主，一生只爱一人，一次只能投一票哦~");
			$(".tipsDiv").show();
		} else if (voteNumbers.length < 1) {
			$(".tipsDiv").html("小主，这么多编号没有一个中意的么~");
			$(".tipsDiv").show();
		} else {
			$.ajax({
				type : "get",
				url : "/vote/vote",
				dataType : "string",
				data: {id:numberId,openid:openid},
				complete:function(XMLHttpRequest) {
					var station =XMLHttpRequest.responseText;
					if(station =="1"){
						$(".tipsDiv").html("小主，你的票已投递至咔芒信箱，送你一个么么哒~");
						$(".tipsDiv").show();
					}else if(station =="2"){
						$(".tipsDiv").html("小主，页面已离开地球了,稍后点我试试~");
						$(".tipsDiv").show();
					}else{
						$(".tipsDiv").html("小主，今日倾其所有已投出三票，休息一下满血复活，明日再来哦~");
						$(".tipsDiv").show();
					};
		        }
			});
		}
	});
	$(".cardImg img,.storyP").each(function(){
        $(this).click(function(){
            $(this).parents("li").siblings(".storyDetails").show();
        })
    });
    $(".appDownload").on('click',function(){
        var u = navigator.userAgent;
        var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端
        var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
        if(isAndroid == true){
            $("#androidD").show();
        };
        if(isiOS == true){
            $("#iosD").show();
        }
    });
    $(".offDivI").on('click',function(){
        $(".storyDetails").hide();
        $('.qrCode').hide();
    });
	
})
