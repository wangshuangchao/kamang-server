package com.mugua.core.ask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.ask.pojo.Ask;
import com.mugua.core.ask.service.AskService;

@RestController
@RequestMapping("/app/ask")
public class AskController {

	@Autowired
	private AskService askServiceImpl;
	
	@PostMapping(value="/addAsk")
	public ResultInfo<String> addAsk(Ask ask){
		ResultInfo<String> result=askServiceImpl.addAsk(ask);
		return result;
	}
	
	@GetMapping(value="/getAsk")
	public ResultInfo<Ask> getAsk(String userId){
		ResultInfo<Ask> result=askServiceImpl.getAsk(userId);
		return result;
	}
}
