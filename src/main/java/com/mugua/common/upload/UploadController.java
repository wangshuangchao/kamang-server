package com.mugua.common.upload;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mugua.common.pojo.ResultInfo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UploadController {

    //跳转到上传文件的页面
    @RequestMapping(value="/goupload", method = RequestMethod.GET)
    public String goUpload() {
    	//跳转到 templates 目录下的 uploadimg.html
    	return "upload";
    }

    //处理文件上传
    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
    public @ResponseBody String uploadImg(@RequestParam("file") MultipartFile file,
            HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);
        //获取绝对磁盘路径
     	 String rootPath=ClassUtils.getDefaultClassLoader().getResource("").getPath();
//        String filePath = request.getSession().getServletContext().getRealPath("upload/");
//        System.out.println("绝对路径"+filePath);
        //保存路径
        String saveUrl=rootPath+"static/upload/";
        System.out.println("保存路径"+saveUrl);
        // 生成随机图片名
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String ext = fileName
				.substring(fileName.lastIndexOf("."));
		String randomFileName = uuid + ext;
		System.out.println("文件名:"+randomFileName);
		// 保存图片 (绝对路径)
		String destFile = saveUrl+ randomFileName;
		File f=new File(destFile);
		System.out.println("保存在哪里"+destFile);
        try {
        	file.transferTo(f);
        	//FileUtils.copyFile(f, destFile);
            //FileUtil.uploadFile(file.getBytes(), filePath, fileName);
            FileUtil.uploadFile(file.getBytes(), destFile, randomFileName);
        } catch (Exception e) {
        	log.error(">>>>>>>>>>>>>>>");
        	log.error(e.getMessage());
        }
        //返回json
        return "uploadimg success";
    }
    
    @Autowired
    private FastDFSClientWrapper dfsClient;

    // 上传图片
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 省略业务逻辑代码。。。
        String imgUrl = dfsClient.uploadFile(file);
        // 。。。。
        return imgUrl;

    }
    // ios上传图片
    @RequestMapping(value = "/uploads", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo<String> uploads(@RequestParam("file") MultipartFile files, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	// 
    	ResultInfo<String> result=new ResultInfo<>();
    		String imgUrl = dfsClient.uploadFile(files);
    		result.setCode("200");
    		result.setData(imgUrl);
    		result.setMsg("上传成功");
    		//System.out.println("打印结果"+imgUrl);
    		return result;
		}
    	
}
