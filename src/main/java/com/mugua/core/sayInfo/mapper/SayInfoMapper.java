package com.mugua.core.sayInfo.mapper;

import com.mugua.core.sayInfo.pojo.SayInfo;
import com.mugua.core.sayInfo.pojo.SayInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SayInfoMapper {
    int countByExample(SayInfoExample example);

    int deleteByExample(SayInfoExample example);

    int deleteByPrimaryKey(Integer sayId);

    int insert(SayInfo record);

    int insertSelective(SayInfo record);

    List<SayInfo> selectByExampleWithBLOBs(SayInfoExample example);

    List<SayInfo> selectByExample(SayInfoExample example);

    SayInfo selectByPrimaryKey(Integer sayId);

    int updateByExampleSelective(@Param("record") SayInfo record, @Param("example") SayInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SayInfo record, @Param("example") SayInfoExample example);

    int updateByExample(@Param("record") SayInfo record, @Param("example") SayInfoExample example);

    int updateByPrimaryKeySelective(SayInfo record);

    int updateByPrimaryKeyWithBLOBs(SayInfo record);

    int updateByPrimaryKey(SayInfo record);
}