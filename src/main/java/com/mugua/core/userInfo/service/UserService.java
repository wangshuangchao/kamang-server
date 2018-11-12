package com.mugua.core.userInfo.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.pojo.UserInfoDto;
import com.mugua.core.userInfo.pojo.UserInfoVo;

public interface UserService {

	ResultInfo<String> regist(UserInfo userInfo);


	//ResultInfo<UserInfoVo> login(String userName, String userPassword);
	

	//List<UserInfo> getUserList();

	void updateStatus(String id,Byte isCentification);

	void deleteUserById(String id);

	UserInfo getUserById(String id);

	List<UserInfo> getUserList(Pageable pag);

	List<UserInfo> searchUser(String keyWord, Pageable pag);

	void deleteUserById(String[] ids);


	ResultInfo<UserInfoVo> login(String userPhone, String userPassword);


	ResultInfo<String> turnPassword(String userPhone, String newPwd);


	ResultInfo<UserInfo> turnLogo(String id, String photoUrl);


	ResultInfo<UserInfo> turnName(String id, String userName);


	ResultInfo<UserInfo> turnType(String id, String companyType);


	ResultInfo<UserInfo> identification(UserInfo userInfo);


	ResultInfo<UserInfoVo> turnIdentification(String id, Byte isCentification);


	ResultInfo<UserInfoVo> fastLogin(String type, UserInfo userInfo);


	ResultInfo<UserInfoVo> judge(String type, String num);


	ResultInfo<UserInfoVo> soLogin(String type, String token);


	UserInfoDto getUserByUid(String id);







}
