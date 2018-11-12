package com.mugua.core.pay.mgorder.mapper;

import com.mugua.core.pay.mgorder.pojo.MgOrder;
import com.mugua.core.pay.mgorder.pojo.MgOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MgOrderMapper {
    int countByExample(MgOrderExample example);

    int deleteByExample(MgOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(MgOrder record);

    int insertSelective(MgOrder record);

    List<MgOrder> selectByExample(MgOrderExample example);

    MgOrder selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") MgOrder record, @Param("example") MgOrderExample example);

    int updateByExample(@Param("record") MgOrder record, @Param("example") MgOrderExample example);

    int updateByPrimaryKeySelective(MgOrder record);

    int updateByPrimaryKey(MgOrder record);
}