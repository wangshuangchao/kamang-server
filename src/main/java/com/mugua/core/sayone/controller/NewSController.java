package com.mugua.core.sayone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.service.SayOneService;

@Controller
@RequestMapping(value="/app")
public class NewSController {

	@Autowired
	private SayOneService sayOneServiceImpl;
	
	@GetMapping("/newsDetails")
	public String newsDetail(String id,Model model){
		SayOneInfo sayOneInfo = sayOneServiceImpl.getDetail(id);
		model.addAttribute("sayOneInfo",sayOneInfo);
		return "newsDetails";
	}
}
