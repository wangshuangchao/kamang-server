package com.mugua.core.brokenlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.core.brokenlist.pojo.BrokenlistInfo;
import com.mugua.core.brokenlist.pojo.BrokenlistVo;
import com.mugua.core.brokenlist.service.BrokenlistService;

@RestController
@RequestMapping(value="/app/brokenlist")
public class BrokenlistController {

	@Autowired
	private BrokenlistService brokenlistServiceImpl;
	@GetMapping("/getList")
	public List<BrokenlistVo> getList(){
		List<BrokenlistVo> list=brokenlistServiceImpl.getList();
		return list;
	}
	@GetMapping("/getDetail")
	public List<BrokenlistInfo> getDetail(String name){
		List<BrokenlistInfo> list=brokenlistServiceImpl.getDetail(name);
		return list;
	}
	
	@GetMapping("/searchList")
	public List<BrokenlistInfo> searchList(String keyword){
		List<BrokenlistInfo> list=brokenlistServiceImpl.searchList(keyword);
		return list;
	}
	
}
