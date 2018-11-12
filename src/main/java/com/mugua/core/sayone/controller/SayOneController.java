package com.mugua.core.sayone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mugua.core.index.pojo.SayOneVo;
import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.service.SayOneService;

@RestController
@RequestMapping(value="/app/sayone")
public class SayOneController {

	@Autowired
	private SayOneService sayOneService;
	
	@GetMapping("/getAll")
	public List<SayOneVo> getAll(){
		List<SayOneVo> list=sayOneService.getAll();
		return list;
	}
	
	@GetMapping("/getList")
	public List<SayOneVo> getList(int page){
		List<SayOneVo> list=sayOneService.getList(page);
		return list;
	}
	
	
	
	//根据id获取详情
	@GetMapping("/getDetail")
	public SayOneInfo getDetail(String id){
		SayOneInfo result=sayOneService.getDetail(id);
		return result;
	}
	
	
}
