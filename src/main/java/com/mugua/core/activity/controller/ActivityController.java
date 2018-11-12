package com.mugua.core.activity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mugua.core.activity.pojo.Share;

@Controller
@RequestMapping(value="/app")
public class ActivityController {

	@GetMapping("/activity")
	public String goActivity(){
		return "activity";
	}
	
	
	/*@GetMapping("/share")
	@ResponseBody()
	public Share lapiao(String ){
		
	}*/
}
