package com.mugua.core.apply.mapper;

import com.mugua.core.apply.pojo.Apply;
import com.mugua.core.apply.pojo.ApplyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface ApplyMapper {
    int countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
    
    @Select("SELECT * FROM apply WHERE uid=#{uid}")
    Apply selectByUid(String uid);
}