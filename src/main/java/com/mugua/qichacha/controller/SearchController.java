package com.mugua.qichacha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.qichacha.pojo.Company;
import com.mugua.qichacha.pojo.CompanyVo;
import com.mugua.qichacha.pojo.SearchVo;
import com.mugua.qichacha.service.QICCService;

@RestController
@RequestMapping("/app/qichacha")
public class SearchController {
	@Autowired
	private QICCService qiCCServiceImpl;
	
	//调用企查查接口,搜索关键字,查询企业信息
	 @RequestMapping(value="/search", method = RequestMethod.GET)
	 public CompanyVo searchCompany(String keyword,int pageIndex){
		 CompanyVo companyVo = qiCCServiceImpl.search(keyword,pageIndex);
		 return companyVo;
	 }
	 //调用企查查接口,搜索关键字,查询企业信息
	 @RequestMapping(value="/searchIndex", method = RequestMethod.GET)
	 public List<SearchVo> searchIndex(String keyword,int pageIndex){
		 List<SearchVo> result = qiCCServiceImpl.searchIndex(keyword,pageIndex);
		 return result;
	 }
	@GetMapping(value="/getDetail")
	 public ResultInfo<Company> getDetail(String id){
		ResultInfo<Company> result=qiCCServiceImpl.getDetail(id);
		return result;
	}
}
