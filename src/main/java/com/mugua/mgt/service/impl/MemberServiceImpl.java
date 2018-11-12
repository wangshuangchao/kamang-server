package com.mugua.mgt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.mgt.mapper.MemberMapper;
import com.mugua.mgt.pojo.Member;
import com.mugua.mgt.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberMapper userMapper;

	@Override
	public Member findUserByUsernameAndPassword(String username, String password) {
		Member user = userMapper.findUserByUserAndPassword(username, password);
		return user;
	}
	
	
}
