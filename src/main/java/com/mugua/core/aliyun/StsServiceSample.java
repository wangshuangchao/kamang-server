package com.mugua.core.aliyun;


import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.sts.model.v20150401.AssumeRoleRequest;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse.Credentials;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoRequest;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class StsServiceSample {
	// 目前只有"cn-hangzhou"这个region可用, 不要使用填写其他region的值
	public static final String REGION_CN_HANGZHOU = "cn-beijing";
	// 当前 STS API 版本
	public static final String STS_API_VERSION = "2015-04-01";

	static AssumeRoleResponse assumeRole(String accessKeyId, String accessKeySecret, String roleArn,
			String roleSessionName, ProtocolType protocolType) throws ClientException {
		try {
			// 创建一个 Aliyun Acs Client, 用于发起 OpenAPI 请求
			IClientProfile profile = DefaultProfile.getProfile(REGION_CN_HANGZHOU, accessKeyId, accessKeySecret);
			DefaultAcsClient client = new DefaultAcsClient(profile);

			// 创建一个 AssumeRoleRequest 并设置请求参数
			final AssumeRoleRequest request = new AssumeRoleRequest();
			request.setVersion(STS_API_VERSION);
			request.setMethod(MethodType.POST);
			request.setProtocol(protocolType);

			request.setRoleArn(roleArn);
			request.setRoleSessionName(roleSessionName);
			// request.setPolicy(policy);

			// 发起请求，并得到response
			final AssumeRoleResponse response = client.getAcsResponse(request);

			return response;
		} catch (ClientException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			throw e;
		}
	}

	public static void main(String[] args) {
		// 只有 RAM用户（子账号）才能调用 AssumeRole 接口
		// 阿里云主账号的AccessKeys不能用于发起AssumeRole请求
		// 请首先在RAM控制台创建一个RAM用户，并为这个用户创建AccessKeys
		String accessKeyId = "LTAIbLWWSl6I22le";
		// String accessKeyId = "LTAIuuZJFaYOYSuf";
		String accessKeySecret = "Hn8gsoQsUAQ7hKMzZi42TExYtRlzkp";
		// String accessKeySecret = "wn1CDGSAmSyGWHap5OGR8mMRGQdhHZ";
		// RoleArn 需要在 RAM 控制台上获取
		// String roleArn = "acs:ram::1102007969195718:role/kamang";
		String roleArn = "acs:ram::1102007969195718:role/xiaobai";

		// RoleSessionName 是临时Token的会话名称，自己指定用于标识你的用户，主要用于审计，或者用于区分Token颁发给谁
		// 但是注意RoleSessionName的长度和规则，不要有空格，只能有'-' '.' '@' 字母和数字等字符
		// 具体规则请参考API文档中的格式要求
		String roleSessionName = "alice-001";
/*
		String policy = "{\n" + "    \"Version\": \"1\", \n" + "    \"Statement\": [\n" + "        {\n"
				+ "            \"Action\": [\n" + "                \"*\"\n" + "            ], \n"
				+ "            \"Resource\": [\n" + "                \"*\" \n" + "            ], \n"
				+ "            \"Effect\": \"Allow\"\n" + "        }\n" + "    ]\n" + "}";*/
		// 此处必须为 HTTPS
		ProtocolType protocolType = ProtocolType.HTTPS;

		try {
			final AssumeRoleResponse response = assumeRole(accessKeyId, accessKeySecret, roleArn, roleSessionName,
					/* policy, */ protocolType);

			System.out.println("Expiration: " + response.getCredentials().getExpiration());
			System.out.println("Access Key Id: " + response.getCredentials().getAccessKeyId());
			System.out.println("Access Key Secret: " + response.getCredentials().getAccessKeySecret());
			System.out.println("Security Token: " + response.getCredentials().getSecurityToken());
		} catch (ClientException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			System.out.println("Failed to get a token.");
			System.out.println("Error code: " + e.getErrCode());
			System.out.println("Error message: " + e.getErrMsg());
		}

	}

	public static Credentials getCredentials(String roleSessionName) {
		// 只有 RAM用户（子账号）才能调用 AssumeRole 接口
		// 阿里云主账号的AccessKeys不能用于发起AssumeRole请求
		// 请首先在RAM控制台创建一个RAM用户，并为这个用户创建AccessKeys
		String accessKeyId = "LTAIbLWWSl6I22le";
		String accessKeySecret = "Hn8gsoQsUAQ7hKMzZi42TExYtRlzkp";
		// RoleArn 需要在 RAM 控制台上获取
		String roleArn = "acs:ram::1102007969195718:role/kamang";
		// 此处必须为 HTTPS
		ProtocolType protocolType = ProtocolType.HTTPS;
		try {
			final AssumeRoleResponse response = assumeRole(accessKeyId, accessKeySecret, roleArn, roleSessionName,
					protocolType);

			log.info(">>>>>>>>>>>>>>>>>获取阿里token");
			log.info("Expiration: " + response.getCredentials().getExpiration());
			log.info("Access Key Id: " + response.getCredentials().getAccessKeyId());
			log.info("Access Key Secret: " + response.getCredentials().getAccessKeySecret());
			log.info("Security Token: " + response.getCredentials().getSecurityToken());
			System.out.println("Expiration: " + response.getCredentials().getExpiration());
			System.out.println("Access Key Id: " + response.getCredentials().getAccessKeyId());
			System.out.println("Access Key Secret: " + response.getCredentials().getAccessKeySecret());
			System.out.println("Security Token: " + response.getCredentials().getSecurityToken());
			return response.getCredentials();
		} catch (ClientException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			System.out.println("Failed to get a token.");
			System.out.println("Error code: " + e.getErrCode());
			System.out.println("Error message: " + e.getErrMsg());
			return null;
		}
	}

	public static GetPlayInfoResponse getPlayInfo(DefaultAcsClient client, String id) {
		GetPlayInfoRequest request = new GetPlayInfoRequest();
		request.setVideoId("id"); // 准备播放的视频ID
		// request.setFormats("mp4,m3u8");
		// request.setAuthTimeout("1800");
		GetPlayInfoResponse response = null;
		try {
			response = client.getAcsResponse(request);
		} catch (ServerException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			throw new RuntimeException("GetPlayInfoRequest Server failed");
		} catch (ClientException e) {
			log.error(">>>>>>>>>>>>>>>>>>>>>");
			log.error("阿里云错误"+e.getErrMsg());
			throw new RuntimeException("GetPlayInfoRequest Client failed");
		}
		response.getVideoBase(); // 视频基本信息
		response.getPlayInfoList(); // 视频播放信息（流信息列表）
		return response;
	}

}
