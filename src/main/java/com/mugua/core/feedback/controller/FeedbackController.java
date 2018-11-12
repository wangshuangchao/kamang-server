package com.mugua.core.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.feedback.pojo.Feedback;
import com.mugua.core.feedback.service.FeedfaceService;

@RestController
@RequestMapping(value="/app/feedback")
public class FeedbackController {

	@Autowired
	private FeedfaceService feedbackServiceImpl;
	
	@PostMapping(value="/addFeedback")
	public ResultInfo<String> addFeedback(Feedback feedback){
		ResultInfo<String> result=feedbackServiceImpl.addFeedback(feedback);
		return result;
	}
}
