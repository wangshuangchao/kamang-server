package com.mugua.core.brokenlist.mapper;

import com.mugua.core.brokenlist.pojo.BrokenlistInfo;
import com.mugua.core.brokenlist.pojo.BrokenlistInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BrokenlistInfoMapper {
    int countByExample(BrokenlistInfoExample example);

    int deleteByExample(BrokenlistInfoExample example);

    int deleteByPrimaryKey(Integer brokenId);

    int insert(BrokenlistInfo record);

    int insertSelective(BrokenlistInfo record);

    List<BrokenlistInfo> selectByExample(BrokenlistInfoExample example);

    BrokenlistInfo selectByPrimaryKey(Integer brokenId);

    int updateByExampleSelective(@Param("record") BrokenlistInfo record, @Param("example") BrokenlistInfoExample example);

    int updateByExample(@Param("record") BrokenlistInfo record, @Param("example") BrokenlistInfoExample example);

    int updateByPrimaryKeySelective(BrokenlistInfo record);

    int updateByPrimaryKey(BrokenlistInfo record);
}