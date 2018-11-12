package com.mugua.core.feedback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.feedback.mapper.FeedbackMapper;
import com.mugua.core.feedback.pojo.Feedback;
import com.mugua.core.feedback.service.FeedfaceService;

@Service
public class FeedfaceServiceImpl implements FeedfaceService {

	@Autowired
	private FeedbackMapper feedbackMapper;
	@Override
	public ResultInfo<String> addFeedback(Feedback feedback) {
		ResultInfo<String> result=new ResultInfo<>();
		int i = feedbackMapper.insert(feedback);
		if(i==1){
			result.setCode("1000");
			result.setData("添加成功");
			result.setMsg("成功");
			return result;
		}
		result.setCode("1001");
		result.setData("添加失败");
		result.setMsg("失败");
		return result;
	}

}
