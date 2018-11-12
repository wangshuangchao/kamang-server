package com.mugua.common.upload;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.exception.FdfsUnsupportStorePathException;
import com.github.tobato.fastdfs.service.FastFileStorageClient;


/**
 * 
 * @ClassName: FastDFSClientWrapper
 * @Description: FastDFS文件上传下载包装类
 * @author muGua
 * @date 2017年10月26日 上午10:33:39
 */
@Component
//@Scope("prototype")
public class FastDFSClientWrapper {
	private final Logger logger = LoggerFactory.getLogger(FastDFSClientWrapper.class);

	@Autowired
	private FastFileStorageClient storageClient;

	/**
	 * 上传文件
	 * 
	 * @param file
	 *            文件对象
	 * @return 文件访问地址
	 * @throws IOException
	 */
	public String uploadFile(MultipartFile file) throws IOException {
		StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(),
				FilenameUtils.getExtension(file.getOriginalFilename()), null);
		return getResAccessUrl(storePath);
	}

	/**
	 * 将一段字符串生成一个文件上传
	 * 
	 * @param content
	 *            文件内容
	 * @param fileExtension
	 * @return
	 */
	public String uploadFile(String content, String fileExtension) {
		byte[] buff = content.getBytes(Charset.forName("UTF-8"));
		ByteArrayInputStream stream = new ByteArrayInputStream(buff);
		StorePath storePath = storageClient.uploadFile(stream, buff.length, fileExtension, null);
		return getResAccessUrl(storePath);
	}

	// 封装图片完整URL地址
	private String getResAccessUrl(StorePath storePath) {
		System.out.println(storePath+"文件名");
		String fileUrl = "http://123.56.5.178:8888/" + storePath.getFullPath();
		System.out.println("访问地址"+fileUrl);
		return fileUrl;
	}

	/**
	 * 删除文件
	 * 
	 * @param fileUrl
	 *            文件访问地址
	 * @return
	 */
	public void deleteFile(String fileUrl) {
		if (StringUtils.isEmpty(fileUrl)) {
			return;
		}
		try {
			StorePath storePath = StorePath.praseFromUrl(fileUrl);
			storageClient.deleteFile(storePath.getGroup(), storePath.getPath());
		} catch (FdfsUnsupportStorePathException e) {
			logger.warn(e.getMessage());
		}
		
		/*// 上传文件，并添加文件元数据
		StorePath uploadFile(InputStream inputStream, long fileSize, String fileExtName, Set<MateData> metaDataSet);
		// 获取文件元数据
		Set<MateData> getMetadata(String groupName, String path);
		// 上传图片并同时生成一个缩略图
		StorePath uploadImageAndCrtThumbImage(InputStream inputStream, long fileSize, String fileExtName,
		            Set<MateData> metaDataSet);*/
	}
}