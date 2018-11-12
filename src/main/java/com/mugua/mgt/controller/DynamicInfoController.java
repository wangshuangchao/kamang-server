package com.mugua.mgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.core.dynamic.pojo.DynamicInfo;
import com.mugua.core.dynamic.service.DynamicService;

@RestController
@RequestMapping(value="/app/management/dynamic")
public class DynamicInfoController {

	@Autowired
	private DynamicService dynamicServiceImpl;
	
	@GetMapping("/getAll")
	public List<DynamicInfo> getAll(){
		List<DynamicInfo> result=dynamicServiceImpl.getAll();
		return result;
	}
	
	@PostMapping("/addDynamic")
	public String addDynamic(DynamicInfo dynamicInfo){
		String result=dynamicServiceImpl.addDynamic(dynamicInfo);
		return result;
	}
	@PostMapping("/updateDynamic")
	public String updateDynamic(DynamicInfo dynamicInfo){
		String result=dynamicServiceImpl.updateDynamic(dynamicInfo);
		return result;
	}
	@PostMapping("/deleteDynamic")
	public String deleteDynamic(String dynamicId){
		String result=dynamicServiceImpl.deleteDynamic(dynamicId);
		return result;
	}
	@PostMapping("/deleteDynamics")
	public String deleteDynamics(String dynamicIds){
		String result=dynamicServiceImpl.deleteDynamics(dynamicIds);
		return result;
	}
	
}
