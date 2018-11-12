package com.mugua.core.feedback.mapper;

import com.mugua.core.feedback.pojo.Feedback;
import com.mugua.core.feedback.pojo.FeedbackExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FeedbackMapper {
    int countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExample(FeedbackExample example);

    Feedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
    
    @Insert("INSERT INTO feedback(ID,CONTENT,TITLE,USERID,USERPHONE) "
			+ "VALUES(#{id},#{content},#{title},#{userid},#{userphone})")
 public int insertFeedback(Feedback feedback);
}