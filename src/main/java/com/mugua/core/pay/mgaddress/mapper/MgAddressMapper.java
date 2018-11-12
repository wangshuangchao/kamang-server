package com.mugua.core.pay.mgaddress.mapper;

import com.mugua.core.pay.mgaddress.pojo.MgAddress;
import com.mugua.core.pay.mgaddress.pojo.MgAddressExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface MgAddressMapper {
	
	@Select("SELECT * FROM mg_address WHERE UID=#{uid}")
	@Results(value={
    		@Result(property = "isDefault", column = "IS_DEFAULT")})
	List<MgAddress> selectByUid(String uid);
	
    int countByExample(MgAddressExample example);

    int deleteByExample(MgAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MgAddress record);
    
    @Insert("INSERT INTO mg_address (UID)values (#{uid})")
    int add(MgAddress record);

    int insertSelective(MgAddress record);

    List<MgAddress> selectByExample(MgAddressExample example);

    MgAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MgAddress record, @Param("example") MgAddressExample example);

    int updateByExample(@Param("record") MgAddress record, @Param("example") MgAddressExample example);

    int updateByPrimaryKeySelective(MgAddress record);

    int updateByPrimaryKey(MgAddress record);
    
    @Update("UPDATE mg_address SET IS_DEFAULT=1 WHERE ID=#{id}")
	@Results(value={
    		@Result(property = "isDefault", column = "IS_DEFAULT")})
    int updateDefault(Integer id);
    
    @Update("UPDATE mg_address SET IS_DEFAULT=0 WHERE UID=#{uid}")
    @Results(value={
    		@Result(property = "isDefault", column = "IS_DEFAULT")})
    int updateNotDefault(String uid);
}