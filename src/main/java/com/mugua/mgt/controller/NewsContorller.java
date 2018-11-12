package com.mugua.mgt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.mgt.service.SayService;

@RestController
@RequestMapping("/app/management")
public class NewsContorller {
	@Autowired
	private SayService sayServiceImpl;
	
	@GetMapping(value="/getNews")
	public List<SayOneInfo> getAll(){
		List<SayOneInfo> list=sayServiceImpl.getNews();
		return list;
	}
	
	@PostMapping(value="/deleteNew")
	public String deleteNew(String id){
		String result=sayServiceImpl.deleteNewById(id);
		return result;
	}
	@PostMapping(value="/deleteNews")
	public List<String> deleteNews(String ids){
		List<String> results=new ArrayList<>();
		if(ids!=null){
			String[] idss = ids.split(",");
			for (String idd : idss) {
				String result=sayServiceImpl.deleteNewById(idd);
				results.add(result);
			}
			return results;
		}else {
			results.add("删除失败");
			return results;
		}
	}
	
	@PostMapping("/addNews")
	public String addNews(SayOneInfo sayOneInfo){
		String result=sayServiceImpl.addNews(sayOneInfo);
		return result;
		
	}
}
