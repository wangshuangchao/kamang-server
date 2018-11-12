package com.mugua.mgt.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mugua.mgt.pojo.Member;

@Mapper
public interface MemberMapper {
	@Select("select * from member where username = #{username} and password=#{password}")
	public Member findUserByUserAndPassword(@Param("username")String username,@Param("password")String password);
}
