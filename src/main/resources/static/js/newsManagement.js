  var contentText=[],
      oneTittle,
      twoTittle,
      photoType,
      articleType,
      uploadFormOne,
      oneText,
      uploadFormTwo,
      twoText,
      uploadFormThree,
      threeText,
      uploadFormFour,
      fourText,
      doUploadCoverOne,
      doUploadCoverTwo,
      doUploadCoverThree,
      doUploadCoverFour;
//图片1
  document.getElementById("file1").addEventListener("change",function(e){
    var files =this.files;
    var fmOne;
    var reader =new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload =function(){
        var formData = new FormData($( "#uploadFormOne" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmOne =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("img1").src=fmOne;
    }
  });
  //图片2
  document.getElementById("file2").addEventListener("change",function(e){
    var files =this.files;
    var fmTwo;
    var reader =new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload =function(){
        var formData = new FormData($( "#uploadFormTwo" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmTwo =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("img2").src=fmTwo;
    }
  });
  //图片3
  document.getElementById("file3").addEventListener("change",function(e){
    var files =this.files;
    var fmThree;
    var reader =new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload =function(){
        var formData = new FormData($( "#uploadFormThree" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmThree =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("img3").src=fmThree;
    }
  });
  //图片4
  document.getElementById("file4").addEventListener("change",function(e){
    var files =this.files;
    var fmFour;
    var reader =new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload =function(){
        var formData = new FormData($("#uploadFormFour" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmFour =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("img4").src=fmFour;
    }
  });
   //封面图片1
  document.getElementById("coverFile1").addEventListener("change",function(e){
      var files =this.files;
      var fmOne;
      var reader =new FileReader();
      reader.readAsDataURL(files[0]);
      reader.onload =function(){
        var formData = new FormData($( "#uploadFormCoverOne" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmOne =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("coverImg1").src=fmOne;
      }
  });
//封面图片2
  document.getElementById("coverFile2").addEventListener("change",function(e){
    var files =this.files;
    var fmOne;
    var reader =new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload =function(){
        var formData = new FormData($( "#uploadFormCoverTwo" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmOne =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("coverImg2").src=fmOne;
    }
  });
  //封面图片3
  document.getElementById("coverFile3").addEventListener("change",function(e){
    var files =this.files;
    var fmOne;
    var reader =new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload =function(){
        var formData = new FormData($( "#uploadFormCoverThree" )[0]);
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                fmOne =data;
            },
            error: function () {
                alert('失败');
            }
        });
        document.getElementById("coverImg3").src=fmOne;
    }
  });

    $('#releaseBtn').on('click',function(){
        oneTittle =$('#oneTittle').val();
        twoTittle =$('#twoTittle').val();
        photoType =$('.photoType input:radio:checked').val();
        doUploadCoverOne =$("#uploadFormCoverOne img").attr('src');
        doUploadCoverTwo =$("#uploadFormCoverTwo img").attr('src');
        doUploadCoverThree =$("#uploadFormCoverThree img").attr('src');
        doUploadCoverFour =$("#uploadFormCoverFour img").attr('src');
        articleType =$('.newType input:radio:checked').val();
        uploadFormOne =$("#uploadFormOne img").attr('src');
        oneText =$("#oneText").val();
        uploadFormTwo=$("#uploadFormTwo img").attr('src');
        twoText =$("#twoText").val();
        uploadFormThree=$("#uploadFormThree img").attr('src');
        threeText=$("#threeText").val();
        uploadFormFour=$("#uploadFormFour img").attr('src');
        fourText=$("#fourText").val();

        if(oneTittle=='' && twoTittle=='' && doUploadCoverOne=='' && doUploadCoverTwo=='' && doUploadCoverThree=='' && doUploadCoverFour=='' && uploadFormOne=='' && oneText=='' && uploadFormTwo=='' && twoText=='' && uploadFormThree=='' && threeText=='' && uploadFormFour=='' && fourText==''){
            alert('不能全部内容为空');
            return
        }
        if(oneTittle==''){
            alert("请输入一级标题");
            return
        }
        if(oneText=='' && twoText=='' && threeText==''&& fourText=='' ){
            alert("必须输入一段文字");
            return
        }
        if(doUploadCoverOne ==''){
            doUploadCoverOne ='0';
        }
        if(doUploadCoverTwo==""){
            doUploadCoverTwo="0";
        }
        if(doUploadCoverThree==""){
            doUploadCoverThree="0";
        }
        if(uploadFormOne==""){
            uploadFormOne="0";
        }
        if(uploadFormTwo==""){
            uploadFormTwo="0";
        }
        if(uploadFormThree==""){
            uploadFormThree="0";
        }
        if(uploadFormFour==""){
            uploadFormFour="0";
        }
        $.ajax({
            type: "POST",
            url: "/app/management/addNews",
            data: {
                titleOne:oneTittle,
                titleTwo:twoTittle,
                photoType:photoType,
                newType :articleType,
                contPhotoOneUrl:uploadFormOne,
                contTextOne:oneText,
                contPhotoTwoUrl:uploadFormTwo,
                contTextTwo:twoText,
                contPhotoThrUrl:uploadFormThree,
                contTextThr:threeText,
                contPhotoForUrl:uploadFormFour,
                contTextFor:fourText,
                coverPhotoOneUrl:doUploadCoverOne,
                coverPhotoTwoUrl:doUploadCoverTwo,
                coverPhotoThrUrl:doUploadCoverThree,
                coverPhotoForUrl:doUploadCoverFour
            },
            success:function(){
                console.log('成功')
            },
            error:function(){
                console.log('失败')
            }
        });
        contentText=[];
        alert("发布成功");
        parent.location.reload();
    });

