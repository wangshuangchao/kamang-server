package com.mugua.core.aliyun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse.Credentials;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.mugua.core.aliyun.StsServiceSample;
import com.mugua.core.aliyun.util.AliUtil;

@RestController
@RequestMapping("/videoUpload")
public class ALiContorller {
	public static String accessKeyId = "LTAIbLWWSl6I22le";
	public static String accessKeySecret = "Hn8gsoQsUAQ7hKMzZi42TExYtRlzkp";
	@GetMapping("/getCredentials")
	public Credentials getCredentials(String roleSessionName){
		Credentials credentials = StsServiceSample.getCredentials(roleSessionName);
		return credentials;
	}
	
	@GetMapping("/getVideoUrl")
	public GetPlayInfoResponse getVideoUrl(String id){
		DefaultProfile profile = DefaultProfile.getProfile("cn-beijing", accessKeyId, accessKeySecret);
		DefaultAcsClient client = new DefaultAcsClient(profile);
		GetPlayInfoResponse playInfo = AliUtil.getPlayInfo(client, id);
		return playInfo;
	}
}
