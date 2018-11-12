package com.mugua.core.update.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.update.pojo.UpdateInfo;
import com.mugua.core.update.service.UpdateService;

@RestController
@RequestMapping("/app")
public class UpdateController {
	
	@Autowired
	private UpdateService updateServiceImpl;
	
	@GetMapping("/updateInfo")
	public ResultInfo<UpdateInfo> getUpdateInfo(){
		ResultInfo<UpdateInfo> result=updateServiceImpl.getUpdateInfo();
		return result;
		
	}

}
