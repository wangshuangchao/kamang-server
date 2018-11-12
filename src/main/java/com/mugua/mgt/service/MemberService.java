package com.mugua.mgt.service;

import com.mugua.mgt.pojo.Member;

public interface MemberService {
	Member findUserByUsernameAndPassword(String username,String password);
}
