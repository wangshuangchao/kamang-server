package com.mugua.core.sayone.mapper;

import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.pojo.SayOneInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface SayOneInfoMapper {
    int countByExample(SayOneInfoExample example);

    int deleteByExample(SayOneInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SayOneInfo record);

    int insertSelective(SayOneInfo record);

    List<SayOneInfo> selectByExample(SayOneInfoExample example);

    SayOneInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SayOneInfo record, @Param("example") SayOneInfoExample example);

    int updateByExample(@Param("record") SayOneInfo record, @Param("example") SayOneInfoExample example);

    int updateByPrimaryKeySelective(SayOneInfo record);

    int updateByPrimaryKey(SayOneInfo record);
    
    //@Select("select * from say_one_info where PHOTO_TYPE='1' limit 4 ")
    @Select("select * from say_one_info")
    List<SayOneInfo> selectPaging();
}