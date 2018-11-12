package com.mugua.core.ask.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mugua.core.ask.pojo.Ask;

@Mapper
public interface AskMapper {

	 @Select("select * from ask where USER_ID=#{userId}")
	    @Results(value={
	    		@Result(property = "customerName", column = "CUSTOMER_NAME"),@Result(property = "customerPhone", column = "CUSTOMER_PHONE"),
	    		@Result(property = "userId", column = "USER_ID"),@Result(property = "createTime", column = "CREATE_TIME")})
	 public Ask selectById(String userId);
	 
	 @Insert("INSERT INTO ask(id,USER_ID, CUSTOMER_NAME, CUSTOMER_PHONE, CREATE_TIME) "
				+ "VALUES(#{id},#{userId},#{customerName},#{customerPhone},#{createTime})")
	 public int insertAsk(Ask ask);
	 
	
}
