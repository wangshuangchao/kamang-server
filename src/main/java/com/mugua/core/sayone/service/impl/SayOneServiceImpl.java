package com.mugua.core.sayone.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.mugua.core.index.pojo.SayOneVo;
import com.mugua.core.sayone.mapper.SayOneInfoMapper;
import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.pojo.SayOneInfoExample;
import com.mugua.core.sayone.service.SayOneService;
@Service
@Transactional
@SuppressWarnings("all")
public class SayOneServiceImpl implements SayOneService {

	@Autowired
	private SayOneInfoMapper sayOneMapper;
	@Autowired
	private RedisTemplate redisTemplate;
	@Override
	public List<SayOneVo> getAll() {
		SayOneInfoExample example=new SayOneInfoExample();
		List<SayOneVo> result=new ArrayList<>();
		List<SayOneInfo> list = sayOneMapper.selectByExample(example);
		for (SayOneInfo sayOneInfo : list) {
			SayOneVo sayOne=new SayOneVo();
			BeanUtils.copyProperties(sayOneInfo, sayOne);
			result.add(sayOne);
		}
		return result;
	}

	@Override
	public List<SayOneInfo> getPaging() {
		List<SayOneInfo> list = sayOneMapper.selectPaging();
		return list;
	}


	@Override
	public SayOneInfo getDetail(String id) {
		SayOneInfo sayOneInfo = sayOneMapper.selectByPrimaryKey(id);
		//获取缓存中的浏览人数
		Object object = redisTemplate.opsForValue().get(id+"count");
		//如果缓存中没有则调用数据库中数据
		if(object==null){
			object=sayOneInfo.getBrowseNumber();
		}
		Integer count=(Integer) object;
		count++;
		if(sayOneInfo!=null){
			sayOneInfo.setBrowseNumber(count);
			redisTemplate.opsForValue().set(id+"count", count);
			sayOneMapper.updateByPrimaryKeySelective(sayOneInfo);
			return sayOneInfo;
		}else {
			return null;
		}
	}

	@Override
	public List<SayOneVo> getList(int page) {
		/*  
         * 第一个参数是第几页；第二个参数是每页显示条数。  
         */
		SayOneInfoExample example=new SayOneInfoExample();
		List<SayOneVo> result=new ArrayList<>();
		PageHelper.startPage(page,7);
		List<SayOneInfo> list = sayOneMapper.selectByExample(example);
		for (SayOneInfo sayOneInfo : list) {
			SayOneVo sayOne=new SayOneVo();
			BeanUtils.copyProperties(sayOneInfo, sayOne);
			result.add(sayOne);
		}
		return result;
	}


	
}
