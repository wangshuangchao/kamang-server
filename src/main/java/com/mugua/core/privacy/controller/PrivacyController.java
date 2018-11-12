package com.mugua.core.privacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/app/privacy")
public class PrivacyController {

	@GetMapping(value="/goPrivacy")
	public String goPrivacy(){
		return "privacy";
	}
	
}
