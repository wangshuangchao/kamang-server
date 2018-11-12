package com.mugua.core.message.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.aliyuncs.exceptions.ClientException;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.message.service.MessageService;
import com.mugua.core.message.util.SmsUtil;
import com.mugua.core.userInfo.mapper.UserInfoMapper;
import com.mugua.core.userInfo.pojo.UserInfo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {
	@Autowired
	private SmsUtil smsUtil;//阿里发送短信的工具类
	
	@Autowired // redis
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public ResultInfo<String>  sendMessage(String phone){
		//生成验证码
		String smscode = (long) ((Math.random()*9+1)*100000) + "";
		//将短信信息保存在redis 保存时间10分钟
		stringRedisTemplate.opsForValue().set(phone, smscode,60*10,TimeUnit.SECONDS);
		try {
			smsUtil.sendMsgByAL(phone, smscode);
			ResultInfo<String> result=new ResultInfo<String>();
			result.setCode("1000");
			result.setData(smscode);
			result.setMsg("发送成功");
			return result;
		} catch (ClientException e) {
			ResultInfo<String> result=new ResultInfo<String>();
			result.setCode("1001");
			result.setData(e.getMessage());
			result.setMsg("发送失败");
			e.printStackTrace();
			log.error(">>>>>>>>>>>>>>>");
			log.error(e.getErrMsg());
			return result;
		}
	}


	@Override
	public ResultInfo<String> forgetPwd(String phone) {
		UserInfo userInfo=userInfoMapper.selectByPhone(phone);
		//用户存在则发送验证码
		if(userInfo!=null){
			return sendMessage(phone);
			//如果用户不存在
		}else{
			ResultInfo<String> result =new ResultInfo<>();
			result.setCode("1003");
			result.setMsg("用户未注册");
			return result;
		}
	}


	@Override
	public ResultInfo<String> newRegist(String phone) {
		UserInfo userInfo=userInfoMapper.selectByPhone(phone);
		//用户存在则发送验证码
		if(userInfo==null){
			return sendMessage(phone);
			//如果用户不存在
		}else{
			ResultInfo<String> result =new ResultInfo<>();
			result.setCode("1004");
			result.setMsg("用户已注册");
			return result;
		}
	}


	
}
