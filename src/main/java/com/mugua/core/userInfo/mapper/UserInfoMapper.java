package com.mugua.core.userInfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.pojo.UserInfoExample;
@Mapper
public interface UserInfoMapper {
	int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExampleWithBLOBs(UserInfoExample example);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKeyWithBLOBs(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    @Select("select * from user_info")
    @Results(value={
    		@Result(property = "userName", column = "USER_NAME"),@Result(property = "userGender", column = "USER_GENDER"),
    		@Result(property = "userAge", column = "USER_AGE"),@Result(property = "userPhone", column = "USER_PHONE"),
    		@Result(property = "isCentification", column = "IS_CENTIFICATION"),@Result(property = "productUrlOne", column = "PRODUCT_URL_ONE"),
    		@Result(property = "productUrlTwo", column = "PRODUCT_URL_TWO"),@Result(property = "companyVidio", column = "COMPANY_VIDIO"),
    		@Result(property = "businessLicensePhotoUrl", column = "BUSINESS_LICENSE_PHOTO_URL"),@Result(property = "legalPersonName", column = "LEGAL_PERSON_NAME"),
    		@Result(property = "organizationCode", column = "ORGANIZATION_CODE"),@Result(property = "registeredAssets", column = "REGISTERED_ASSETS"),
    		@Result(property = "createTime", column = "CREATE_TIME"),@Result(property = "legalPersonId", column = "LEGAL_PERSON_ID"),
    		@Result(property = "createUserTime", column = "CREATE_USER_TIME"),@Result(property = "companyType", column = "COMPANY_TYPE"),
    		@Result(property = "legalPersonPhone", column = "LEGAL_PERSON_PHONE"),@Result(property = "legalPersonPhotoUrl", column = "LEGAL_PERSON_PHOTO_URL"),
    		@Result(property = "attendingPersonnel", column = "ATTENDING_PERSONNEL"),@Result(property = "scopeOfBusiness", column = "SCOPE_OF_BUSINESS"),
    		@Result(property = "timeLimit", column = "TIME_LIMIT"),@Result(property = "companyAddr", column = "COMPANY_ADDR"),
    		@Result(property = "introduceCompany", column = "INTRODUCE_COMPANY"),
    		@Result(property = "userPassword", column = "USER_PASSWORD"),@Result(property = "photoUrl", column = "PHOTO_URL")})
    List<UserInfo> selectAll();
    
    @Select("select * from user_info where id=#{id}")
    @Results(value={
    		@Result(property = "userName", column = "USER_NAME"),@Result(property = "userGender", column = "USER_GENDER"),
    		@Result(property = "userAge", column = "USER_AGE"),@Result(property = "userPhone", column = "USER_PHONE"),
    		@Result(property = "isCentification", column = "IS_CENTIFICATION"),@Result(property = "productUrlOne", column = "PRODUCT_URL_ONE"),
    		@Result(property = "productUrlTwo", column = "PRODUCT_URL_TWO"),@Result(property = "companyVidio", column = "COMPANY_VIDIO"),
    		@Result(property = "businessLicensePhotoUrl", column = "BUSINESS_LICENSE_PHOTO_URL"),@Result(property = "legalPersonName", column = "LEGAL_PERSON_NAME"),
    		@Result(property = "organizationCode", column = "ORGANIZATION_CODE"),@Result(property = "registeredAssets", column = "REGISTERED_ASSETS"),
    		@Result(property = "createTime", column = "CREATE_TIME"),@Result(property = "legalPersonId", column = "LEGAL_PERSON_ID"),
    		@Result(property = "createUserTime", column = "CREATE_USER_TIME"),@Result(property = "companyType", column = "COMPANY_TYPE"),
    		@Result(property = "introduceCompany", column = "INTRODUCE_COMPANY"),
    		@Result(property = "legalPersonPhone", column = "LEGAL_PERSON_PHONE"),@Result(property = "legalPersonPhotoUrl", column = "LEGAL_PERSON_PHOTO_URL"),
    		@Result(property = "attendingPersonnel", column = "ATTENDING_PERSONNEL"),@Result(property = "scopeOfBusiness", column = "SCOPE_OF_BUSINESS"),
    		@Result(property = "timeLimit", column = "TIME_LIMIT"),@Result(property = "companyAddr", column = "COMPANY_ADDR"),
    		@Result(property = "introduceCompany", column = "INTRODUCE_COMPANY"),
    		@Result(property = "userPassword", column = "USER_PASSWORD"),@Result(property = "photoUrl", column = "PHOTO_URL")})
    UserInfo selectById(String id);
    
    @Update ("update user_info set IS_CENTIFICATION =#{isCentification} where ID=#{id} ")
    int updateUserById(@Param("id")String id,@Param("isCentification")Byte isCentification);
    
    @Update ("update user_info set USER_PASSWORD =#{newPwd} where USER_PHONE=#{userPhone}")
    int updatePwdByPhone(@Param("userPhone")String userPhone,@Param("newPwd")String  newPwd);
    
    @Delete("delete from user_info where id=#{id}")  
    public void deleteUser(String id);

    @Select("select * from user_info where USER_PHONE=#{phone}")
    @Results(value={
    		@Result(property = "userName", column = "USER_NAME"),@Result(property = "userGender", column = "USER_GENDER"),
    		@Result(property = "userAge", column = "USER_AGE"),@Result(property = "userPhone", column = "USER_PHONE"),
    		@Result(property = "isCentification", column = "IS_CENTIFICATION"),@Result(property = "productUrlOne", column = "PRODUCT_URL_ONE"),
    		@Result(property = "productUrlTwo", column = "PRODUCT_URL_TWO"),@Result(property = "companyVidio", column = "COMPANY_VIDIO"),
    		@Result(property = "businessLicensePhotoUrl", column = "BUSINESS_LICENSE_PHOTO_URL"),@Result(property = "legalPersonName", column = "LEGAL_PERSON_NAME"),
    		@Result(property = "organizationCode", column = "ORGANIZATION_CODE"),@Result(property = "registeredAssets", column = "REGISTERED_ASSETS"),
    		@Result(property = "createTime", column = "CREATE_TIME"),@Result(property = "legalPersonId", column = "LEGAL_PERSON_ID"),
    		@Result(property = "createUserTime", column = "CREATE_USER_TIME"),@Result(property = "companyType", column = "COMPANY_TYPE"),
    		@Result(property = "legalPersonPhone", column = "LEGAL_PERSON_PHONE"),@Result(property = "legalPersonPhotoUrl", column = "LEGAL_PERSON_PHOTO_URL"),
    		@Result(property = "attendingPersonnel", column = "ATTENDING_PERSONNEL"),@Result(property = "scopeOfBusiness", column = "SCOPE_OF_BUSINESS"),
    		@Result(property = "introduceCompany", column = "INTRODUCE_COMPANY"),
    		@Result(property = "timeLimit", column = "TIME_LIMIT"),@Result(property = "companyAddr", column = "COMPANY_ADDR"),
    		
    		@Result(property = "userPassword", column = "USER_PASSWORD"),@Result(property = "photoUrl", column = "PHOTO_URL")})
	UserInfo selectByPhone(String phone);
}