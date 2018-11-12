package com.mugua.core.dynamic.mapper;

import com.mugua.core.dynamic.pojo.DynamicInfo;
import com.mugua.core.dynamic.pojo.DynamicInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface DynamicInfoMapper {
    int countByExample(DynamicInfoExample example);

    int deleteByExample(DynamicInfoExample example);

    int deleteByPrimaryKey(String dynamicId);

    int insert(DynamicInfo record);

    int insertSelective(DynamicInfo record);

    List<DynamicInfo> selectByExample(DynamicInfoExample example);

    DynamicInfo selectByPrimaryKey(String dynamicId);

    int updateByExampleSelective(@Param("record") DynamicInfo record, @Param("example") DynamicInfoExample example);

    int updateByExample(@Param("record") DynamicInfo record, @Param("example") DynamicInfoExample example);

    int updateByPrimaryKeySelective(DynamicInfo record);

    int updateByPrimaryKey(DynamicInfo record);
    
    @Select("select * from dynamic_info limit 4")
    List<DynamicInfo> selectAll();

}