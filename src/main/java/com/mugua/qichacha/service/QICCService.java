package com.mugua.qichacha.service;

import java.util.List;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.qichacha.pojo.Company;
import com.mugua.qichacha.pojo.CompanyVo;
import com.mugua.qichacha.pojo.SearchVo;

public interface QICCService {

	CompanyVo searchWide(String keyWord);
	
	public CompanyVo searchWides(String keyword,int pageIndex);
	
	public CompanyVo searchCompany(String keyword,int pageIndex);
	
	public CompanyVo searchUser(String keyword,int pageIndex);

	
	CompanyVo search(String keyword, int pageIndex);
	
	public List<SearchVo> searchUserInfo(String keyword,int pageIndex);
	public List<SearchVo> searchLocal(String keyword, int pageIndex);
	public List<SearchVo> searchEnterprise(String keyword,int pageIndex);
	
	public ResultInfo<Object> inquire(String keyword,int page);

	List<SearchVo> searchIndex(String keyword, int pageIndex);

	ResultInfo<Company> getDetail(String id);
}
