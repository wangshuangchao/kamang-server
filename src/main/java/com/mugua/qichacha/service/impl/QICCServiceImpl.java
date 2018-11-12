package com.mugua.qichacha.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.common.util.KMRandomUtils;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.repository.UserInfoRepository;
import com.mugua.qichacha.mapper.CompanyMapper;
import com.mugua.qichacha.pojo.Company;
import com.mugua.qichacha.pojo.CompanyVo;
import com.mugua.qichacha.pojo.Paging;
import com.mugua.qichacha.pojo.SearchVo;
import com.mugua.qichacha.repository.CompanyRepository;
import com.mugua.qichacha.service.QICCService;

@Service
@Transactional
public class QICCServiceImpl implements QICCService {

	@Autowired
	private RestOperations restOperations;

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
	@Autowired
	UserInfoRepository userInfoRepository;

	@Autowired
	private CompanyMapper companyMapper;

	@Override
	public CompanyVo searchWide(String keyword) {

		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<>();
		paramMap.add("key", "d413cf32182e44ec89afea7f66476cf1");
		paramMap.add("keyword", keyword);
		// String url =
		// "http://i.yjapi.com/ECIV4/SearchWide?key={key}&keyword={keyword}";
		String url = "http://dev.i.yjapi.com/ECIV4/Search?key={key}&keyword={keyword}";
		// Map<String, Object> uriVariables = new HashMap<String, Object>();
		String result = restOperations.getForObject(url, String.class, paramMap);
		System.out.println("结果" + result);
		;
		Gson gson = new Gson();
		CompanyVo companyVo = gson.fromJson(result, CompanyVo.class);
		return companyVo;
	}

	@Override // 调用企查查接口,查询关键字
	public CompanyVo searchWides(String keyword, int pageIndex) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://i.yjapi.com/ECIV4/SearchWide?key={key}&keyword={keyword}&pageSize={pageSize}&pageIndex={pageIndex}";
		Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("key", "d413cf32182e44ec89afea7f66476cf1");
		uriVariables.put("keyword", keyword);
		// 设置每页15条
		uriVariables.put("pageSize", 15);
		uriVariables.put("pageIndex", pageIndex);
		String result = restTemplate.getForObject(url, String.class, uriVariables);
		result = result.replaceAll("T00", " 00");
		System.out.println(result);
		Gson gson = new Gson();
		CompanyVo companyVo = gson.fromJson(result, CompanyVo.class);
		List<Company> companys = companyVo.getResult();

		for (Company company : companys) {
			// 判断是否数据库已经存在
			Company company2 = companyMapper.selectByCreditCode(company.getCreditCode());
			// 如果不存在,存入数据库并建立索引
			if (company2 == null) {
				//String uuid = UUID.randomUUID().toString().replaceAll("-", "");
				company.setId(KMRandomUtils.getRandomAlphamericStr(8));
				System.out.println("测试" + company);
				// 将查询到的数据保存到数据库
				companyMapper.insertCompany(company);
				// 将数据存入ES,并建立索引
				companyRepository.save(company);
			} else {
				company.setId(company2.getId());
			}

		}
		return companyVo;
	}

	@Override
	public CompanyVo searchCompany(String keyword, int pageIndex) {
		List<Company> Result = new ArrayList<Company>();
		String queryString = keyword;// 搜索关键字
		QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);

		Iterable<Company> searchResult = companyRepository.search(builder);
		Iterator<Company> iterator = searchResult.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Company company = iterator.next();
			Result.add(company);
			count++;
		}
		// 设置页码信息
		Paging Paging = new Paging();
		Paging.setPageIndex(1);
		Paging.setPageSize(count);
		Paging.setTotalRecords(count);
		CompanyVo companyVo = new CompanyVo();
		companyVo.setMessage("获取成功");
		companyVo.setStatus("201");
		companyVo.setResult(Result);
		companyVo.setPaging(Paging);
		return companyVo;
	}

	@Override
	public CompanyVo searchUser(String keyword, int pageIndex) {
		String queryString = keyword;// 搜索关键字
		QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
		List<UserInfo> user = new ArrayList<>();
		Iterable<UserInfo> searchResult = userInfoRepository.search(builder);
		Iterator<UserInfo> iterator = searchResult.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			UserInfo userinfo = iterator.next();
			user.add(userinfo);
			count++;
		}
		Paging Paging = new Paging();
		Paging.setPageIndex(1);
		Paging.setPageSize(count);
		Paging.setTotalRecords(count);
		CompanyVo companyVo = new CompanyVo();
		companyVo.setMessage("获取成功");
		companyVo.setStatus("202");
		companyVo.setUser(user);
		return companyVo;
	}

	/**
	 * 模糊搜索:首先搜索本地注册账号信息,如果没有,搜索本地company库里数据,如果都没有
	 * 则搜索企查查接口
	 */
	@Override
	public CompanyVo search(String keyword, int pageIndex) {
		CompanyVo searchUser = searchUser(keyword, pageIndex);
		if (searchUser == null) {
			CompanyVo searchCompany = searchCompany(keyword, pageIndex);
			if (searchCompany == null) {
				CompanyVo searchWides = searchWides(keyword, pageIndex);
				return searchWides;
			} else {
				return searchCompany;
			}
		} else {
			return searchUser;
		}
	}
//分割线______________________________________________________________
	@Override
	public ResultInfo<Object> inquire(String keyword, int page) {
		ResultInfo<Object> result=new ResultInfo<>();
		//先查找是否存在已久注册的用户
		
		return result;
	}

	@Override
	public List<SearchVo> searchUserInfo(String keyword, int pageIndex) {
		List<SearchVo> result=new ArrayList<>();
		Pageable pageable = new PageRequest(pageIndex-1, 10);
		//QueryStringQueryBuilder queryString = new QueryStringQueryBuilder(keyword);
		//公司名称匹配查询
		QueryBuilder query = QueryBuilders.wildcardQuery("company", "*"+keyword+"*");
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(query).withPageable(pageable).build();
        List<UserInfo> list = elasticsearchTemplate.queryForList(searchQuery, UserInfo.class);
        if(list!=null && !list.isEmpty()){
        	for (UserInfo userInfo : list) {
        		SearchVo searchVo=new SearchVo();
        		BeanUtils.copyProperties(userInfo, searchVo);
        		Date date = userInfo.getCreateTime();
        		SimpleDateFormat format=new SimpleDateFormat("yyyy年");
    			String createTimes=format.format(date);
    			searchVo.setCreateTimes(createTimes);
        		searchVo.setType("1");
        		searchVo.setStatus("");
        		result.add(searchVo);
        	}
        	return result;
        }
		return null;
	}

	@Override
	public List<SearchVo> searchIndex(String keyword, int pageIndex) {
		List<SearchVo> result=null;
		//先查询是否存在已注册用户
		result=searchUserInfo(keyword, pageIndex);
		//如果为空则搜素本地储存的company信息
		if(result!=null && !result.isEmpty()){
			return result;
		}else{
			result=searchLocal(keyword, pageIndex);
			if(result!=null && !result.isEmpty()){
				return result;
			}else{
				//如果本地为空则搜索企查查
				result=searchEnterprise(keyword, pageIndex);
				return result;
			}
		}
	}

	@Override
	public List<SearchVo> searchEnterprise(String keyword, int pageIndex) {
		List<SearchVo> list=new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://i.yjapi.com/ECIV4/SearchWide?key={key}&keyword={keyword}&pageSize={pageSize}&pageIndex={pageIndex}";
		Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("key", "d413cf32182e44ec89afea7f66476cf1");
		uriVariables.put("keyword", keyword);
		// 设置每页15条
		uriVariables.put("pageSize", 15);
		uriVariables.put("pageIndex", pageIndex);
		String result = restTemplate.getForObject(url, String.class, uriVariables);
		result = result.replaceAll("T00", " 00");
		System.out.println(result);
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create(); 
		CompanyVo companyVo = gson.fromJson(result, CompanyVo.class);
		List<Company> companys = companyVo.getResult();
		for (Company company : companys) {
			SearchVo searchVo=new SearchVo();
			// 判断是否数据库已经存在
			Company company2 = companyMapper.selectByCreditCode(company.getCreditCode());
			// 如果不存在,存入数据库并建立索引
			if (company2 == null) {
				//String uuid = UUID.randomUUID().toString().replaceAll("-", "");
				company.setId(KMRandomUtils.getRandomAlphamericStr(8));
				//System.out.println("测试" + company);
				// 将查询到的数据保存到数据库
				companyMapper.insertCompany(company);
				// 将数据存入ES,并建立索引
				companyRepository.save(company);
			} else {
				company.setId(company2.getId());
			}
			searchVo.setId(company.getId());
			searchVo.setCompany(company.getName());
			searchVo.setLegalPersonName(company.getOperName());
			Date date = company.getStartDate();
			SimpleDateFormat format=new SimpleDateFormat("yyyy年");
			String createTimes=format.format(date);
			searchVo.setCreateTimes(createTimes);
			searchVo.setPhotoUrl("");
			searchVo.setRegisteredAssets("");
			searchVo.setStatus(company.getStatus());
			searchVo.setType("2");
			list.add(searchVo);
		}
		return list;
	}
	@Override
	public List<SearchVo> searchLocal(String keyword, int pageIndex){
		//搜索本地储存信息
		List<SearchVo> result=new ArrayList<>();
		/*Pageable pageable = new PageRequest(pageIndex-1, 10);
		QueryStringQueryBuilder query = new QueryStringQueryBuilder(keyword);
		QueryBuilder query = QueryBuilders.wildcardQuery("Name", "*"+keyword+"*");
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(query).withPageable(pageable).build();
        List<Company> list = elasticsearchTemplate.queryForList(searchQuery, Company.class);*/
		PageHelper.startPage(pageIndex,10);
		List<Company> list = companyMapper.selectByName(keyword);
        if(list.isEmpty()){
        	return null;
        } else {
        	for (Company company : list) {
        		SearchVo searchVo=new SearchVo();
        		searchVo.setId(company.getId());
        		searchVo.setCompany(company.getName());
        		searchVo.setLegalPersonName(company.getOperName());
        		Date date = company.getStartDate();
        		SimpleDateFormat format=new SimpleDateFormat("yyyy年");
        		String createTimes=format.format(date);
        		searchVo.setCreateTimes(createTimes);
        		searchVo.setPhotoUrl("");
        		searchVo.setRegisteredAssets("");
        		searchVo.setStatus(company.getStatus());
        		searchVo.setType("2");
        		result.add(searchVo);
        	}
        	return result;
        }
	}

	@Override
	public ResultInfo<Company> getDetail(String id) {
		Company company = companyMapper.selectById(id);
		ResultInfo<Company> result=new ResultInfo<>();
		if(company!=null){
			result.setCode("1000");
			result.setData(company);
			result.setMsg("获取成功");
			return result;
		}
		result.setCode("1001");
		result.setData(company);
		result.setMsg("获取失败");
		return result;
	}
	
}
