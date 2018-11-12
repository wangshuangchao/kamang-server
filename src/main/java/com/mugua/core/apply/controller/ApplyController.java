package com.mugua.core.apply.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestOperations;

import com.google.gson.Gson;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.activity.pojo.Share;
import com.mugua.core.activity.service.ActivityService;
import com.mugua.core.apply.pojo.Apply;
import com.mugua.core.apply.pojo.ApplyVo;
import com.mugua.core.apply.pojo.Code;
import com.mugua.core.apply.service.ApplyService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/vote")
@Slf4j
public class ApplyController {

	@Autowired
	private ApplyService applyServiceImpl;

	@Autowired
	private RestOperations restOperations;
	
	@Autowired
	private ActivityService activityServiceImpl;

	private static final String appid="wx091dbc466117e559";
	private static final String secret="c5ccba4782c48f6b81927261531d7a6e";
	@GetMapping("/index")
	public String index(ModelMap map,String code){
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid={appid}&secret={secret}&code={code}&grant_type=authorization_code";
		Map<String, Object> uriVariables = new HashMap<String, Object>();
	    uriVariables.put("appid", appid);
	    uriVariables.put("secret", secret);
	    uriVariables.put("code", code);
	    String result = restOperations.getForObject(url, String.class, uriVariables);
	    log.warn("result---------"+result);
	    Gson gson = new Gson();
		Code ccode = gson.fromJson(result, Code.class);
		System.out.println("测试获取code"+ccode);
		String openid=ccode.getOpenid();
		String token=ccode.getAccess_token();
		
		 List<Apply> list=applyServiceImpl.getAll();
		 ApplyVo applyVo=new ApplyVo();
		 applyVo.setList(list);
		 applyVo.setOpenid(openid);
		 applyVo.setToken(token);
		System.out.println(list);
		if(list!=null){
			log.warn("------------------------------------------------------");
			log.warn(applyVo.toString());
			map.addAttribute("applyVo",applyVo);
			return "vote";
		}else 
			return "error";
	}

	//报名
	@PostMapping("/add")
	@ResponseBody
	public ResultInfo<String> add(Apply apply) {
		ResultInfo<String> result = applyServiceImpl.add(apply);
		return result;
	}
	
	//投票
	@GetMapping("/vote")
	@ResponseBody
	public String vote(String openid,String id){
		Integer ids=Integer.parseInt(id);
		String result=applyServiceImpl.vote(openid,ids);
		return result;
	}
	
	//投票
	@GetMapping("/goLoad")
	public String goLoad(){
		return "load";
	}
	
	//分享,获取编号等信息
	@GetMapping("/share")
	@ResponseBody
	public ResultInfo<Share> lafen(String uid){
		ResultInfo<Share> result=activityServiceImpl.share(uid);
		return result;
	}
}
