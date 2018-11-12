package com.mugua.core.index.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.index.pojo.IndexVo;
import com.mugua.core.index.service.IndexService;

@RestController
@RequestMapping(value="/app")
public class IndexController {

	@Autowired
	private IndexService indexServiceImpl;
	
	//app主页
	@GetMapping(value="/index")
	public ResultInfo<IndexVo> index(){
		ResultInfo<IndexVo> result=indexServiceImpl.index();
		return result;
	}
	
	
	
}
