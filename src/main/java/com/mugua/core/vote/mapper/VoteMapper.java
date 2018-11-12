package com.mugua.core.vote.mapper;

import com.mugua.core.vote.pojo.Vote;
import com.mugua.core.vote.pojo.VoteExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface VoteMapper {
    int countByExample(VoteExample example);

    int deleteByExample(VoteExample example);

    int deleteByPrimaryKey(String wechatid);

    int insert(Vote record);

    int insertSelective(Vote record);

    List<Vote> selectByExample(VoteExample example);

    Vote selectByPrimaryKey(String wechatid);

    int updateByExampleSelective(@Param("record") Vote record, @Param("example") VoteExample example);

    int updateByExample(@Param("record") Vote record, @Param("example") VoteExample example);

    int updateByPrimaryKeySelective(Vote record);

    int updateByPrimaryKey(Vote record);
    
    @Update("UPDATE vote set poll=0")
    void clearZero();
}