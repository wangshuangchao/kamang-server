package com.mugua.mgt.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mugua.mgt.pojo.Member;
import com.mugua.mgt.service.MemberService;

@Controller
@RequestMapping("/app/management")
public class ManagementController {
	// 创建日志文件
	
	@Autowired
	private MemberService memberServiceImpl;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String goHome(){
		return "login";
	}
	@RequestMapping(value="/gotomain",method=RequestMethod.GET)
	public String gotomain(){
		return "main";
	}
	@RequestMapping(value="/gotonewsManagement",method=RequestMethod.GET)
	public String gotonewsManagement(){
		return "newsManagement";
	}
	@RequestMapping(value="/gotoenterpriseDynamics",method=RequestMethod.GET)
	public String enterpriseDynamics(){
		return "enterpriseDynamics";
	}
	@RequestMapping(value="/gotoproductAudit",method=RequestMethod.GET)
	public String gotoproductAudit(){
		return "productAudit";
	}
	@RequestMapping(value="/gotoregistrationAudit",method=RequestMethod.GET)
	public String gotoregistrationAudit(){
		return "registrationAudit";
	}
	@RequestMapping(value="/gotonewsList",method=RequestMethod.GET)
	public String gotonewsList(){
		return "newsList";
	}
	@RequestMapping(value="/gotoorderList",method=RequestMethod.GET)
	public String gotoorderList(){
		return "orderList";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Member member){
		Member member2 = memberServiceImpl.findUserByUsernameAndPassword(member.getUsername(), member.getPassword());
		System.out.println(member2);
		if(member2!=null){
			return "home";
		}else {
			return "login";
		}
	}
	
	
}
