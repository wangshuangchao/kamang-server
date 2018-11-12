package com.mugua.core.recordeTypeInfo.mapper;

import com.mugua.core.recordeTypeInfo.pojo.RecordeTypeInfo;
import com.mugua.core.recordeTypeInfo.pojo.RecordeTypeInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RecordeTypeInfoMapper {
    int countByExample(RecordeTypeInfoExample example);

    int deleteByExample(RecordeTypeInfoExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(RecordeTypeInfo record);

    int insertSelective(RecordeTypeInfo record);

    List<RecordeTypeInfo> selectByExample(RecordeTypeInfoExample example);

    RecordeTypeInfo selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") RecordeTypeInfo record, @Param("example") RecordeTypeInfoExample example);

    int updateByExample(@Param("record") RecordeTypeInfo record, @Param("example") RecordeTypeInfoExample example);

    int updateByPrimaryKeySelective(RecordeTypeInfo record);

    int updateByPrimaryKey(RecordeTypeInfo record);
}