package com.mugua.core.message.service;

import com.mugua.common.pojo.ResultInfo;

public interface MessageService {
	
ResultInfo<String> sendMessage(String phone);

ResultInfo<String> forgetPwd(String phone);

ResultInfo<String> newRegist(String phone);

}
