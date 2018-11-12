package com.mugua.core.dynamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.dynamic.service.DynamicService;

@RestController
@RequestMapping(value="/app/dynamicInfo")
public class DynamicController {

	@Autowired
	private DynamicService dynamicServiceImpl;
	
	@GetMapping(value="/getDetail")
	public ResultInfo<Object> getDetail(String id){
		ResultInfo<Object> result=dynamicServiceImpl.getDetail(id);
		return result;
	}
	
}
