package com.mugua.core.tipOffInfo.mapper;

import com.mugua.core.tipOffInfo.pojo.TipOffInfo;
import com.mugua.core.tipOffInfo.pojo.TipOffInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TipOffInfoMapper {
    int countByExample(TipOffInfoExample example);

    int deleteByExample(TipOffInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TipOffInfo record);

    int insertSelective(TipOffInfo record);

    List<TipOffInfo> selectByExample(TipOffInfoExample example);

    TipOffInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TipOffInfo record, @Param("example") TipOffInfoExample example);

    int updateByExample(@Param("record") TipOffInfo record, @Param("example") TipOffInfoExample example);

    int updateByPrimaryKeySelective(TipOffInfo record);

    int updateByPrimaryKey(TipOffInfo record);
}