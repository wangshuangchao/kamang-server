package com.mugua.core.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.message.service.MessageService;

@RestController
@RequestMapping("/app")
public class MessageController {

	@Autowired
	private MessageService messageServiceImpl;

	@RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
	public ResultInfo<String> sendMessage(String phone, String type) {
		// 0为新用户注册
		if ("0".equals(type)) {
			ResultInfo<String> result = messageServiceImpl.newRegist(phone);
			return result;
		} else if ("1".equals(type)) {
			ResultInfo<String> result = messageServiceImpl.forgetPwd(phone);
			return result;
		}else if ("2".equals(type)) {
			ResultInfo<String> result = messageServiceImpl.sendMessage(phone);
			return result;
		}
		return null;
	}
}