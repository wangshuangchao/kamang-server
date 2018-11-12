package com.mugua.mgt.controller;

import java.util.List;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.service.UserService;
@RestController
@RequestMapping("/app/management")
public class CurdController {
	@Autowired
	private UserService userServiceImpl;
	@Autowired
    ElasticsearchTemplate elasticsearchTemplate;
	
	/**
	 * 获取所有用户信息
	 * @return
	 */
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<UserInfo> getAll(@PageableDefault/*(sort = "weight", direction =Direction.DESC)*/ Pageable pag){
		List<UserInfo>  result = userServiceImpl.getUserList(pag);
		return result;
	}
	/**
	 * 获取所有用户信息
	 * @return
	 */
	@RequestMapping(value="/searchUser",method=RequestMethod.GET)//page,size
	public List<UserInfo> searchUser(String keyWord,int page){
		System.out.println(page);
		Pageable pageable = new PageRequest(page-1, 10);
		QueryStringQueryBuilder queryString = new QueryStringQueryBuilder(keyWord);
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(queryString).withPageable(pageable).build();
        List<UserInfo> list = elasticsearchTemplate.queryForList(searchQuery, UserInfo.class);
		//List<UserInfo>  result = userServiceImpl.searchUser(keyWord,pag);
		return list;
	}
	/**
	 * 修改认证状态:0为未认证;1为已认证;2为不弹框
	 * @param id
	 * @param isCentification
	 */
	@RequestMapping(value="/updataStatus",method=RequestMethod.POST)
	public void  updataStatus(String id,Byte isCentification){
		userServiceImpl.updateStatus(id,isCentification);
	}
	/**
	 * 根据用户id删除信息
	 * @param id
	 */
	@RequestMapping(value="/deleteUser",method=RequestMethod.POST)
	public void deleteUser(String id){
		userServiceImpl.deleteUserById(id);
	}
	/**
	 * 根据用户id批量删除信息
	 * @param id
	 */
	@RequestMapping(value="/deleteUsers",method=RequestMethod.POST)
	public void deleteUsers(String[] ids){
		userServiceImpl.deleteUserById(ids);
	}
	/**
	 * 根据用户ID获取详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	public UserInfo getUserById(String id){
		UserInfo userInfo=userServiceImpl.getUserById(id);
		return userInfo;
	}
	
}
