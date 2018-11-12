package com.mugua.core.aliyun.util;

import java.util.List;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoRequest;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.PlayInfo;

import lombok.extern.slf4j.Slf4j;

//import com.aliyuncs.vod.model.v20170321.GetVideoPlayInfoRequest;
@Slf4j
public class AliUtil {
	
	public static String accessKeyId = "LTAIbLWWSl6I22le";
	public static String accessKeySecret = "Hn8gsoQsUAQ7hKMzZi42TExYtRlzkp";
	
	public static GetPlayInfoResponse getPlayInfo(DefaultAcsClient vodClient, String videoId) {
		GetPlayInfoRequest req = new GetPlayInfoRequest(); //
		// GetVideoPlayInfoRequest req = new GetVideoPlayInfoRequest();
		req.setVideoId(videoId);
		GetPlayInfoResponse res = null;
		try {
			res = vodClient.getAcsResponse(req);
		} catch (ServerException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			e.printStackTrace();
			throw new RuntimeException("GetVideoPlayAuthRequest Server failed");
		} catch (ClientException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			e.printStackTrace();
			throw new RuntimeException("GetVideoPlayAuthRequest Client failed");
		}
		List<PlayInfo> infos = res.getPlayInfoList();
		for (PlayInfo info : infos) {
			System.out.println(info.getDuration());
			System.out.println(info.getPlayURL());
		}
		return res;
	}

	/*public static void main(String[] args) {
		DefaultProfile profile = DefaultProfile.getProfile("cn-beijing", accessKeyId, accessKeySecret);
		DefaultAcsClient client = new DefaultAcsClient(profile);
		String videoId = "e6d5fbfc751d447d8519aa41084151fb";
		GetPlayInfoResponse res = getPlayInfo(client, videoId);
	}*/
}
