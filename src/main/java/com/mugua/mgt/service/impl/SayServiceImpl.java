package com.mugua.mgt.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.mugua.common.util.KMRandomUtils;
import com.mugua.core.sayone.mapper.SayOneInfoMapper;
import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.pojo.SayOneInfoExample;
import com.mugua.mgt.service.SayService;
@Service
@SuppressWarnings("all")
public class SayServiceImpl implements SayService{
	@Autowired
	private SayOneInfoMapper sayInfoMapper;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Override
	public List<SayOneInfo> getNews() {
		SayOneInfoExample example=new SayOneInfoExample();
		List<SayOneInfo> list = sayInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public String deleteNewById(String id) {
		int i = sayInfoMapper.deleteByPrimaryKey(id);
		if(i==1){
			return "删除成功";
		}else {
			return "删除失败";
		}
	}

	@Override
	public String addNews(SayOneInfo sayOneInfo) {
		String uuid =KMRandomUtils.getRandomAlphamericStr(8);
		sayOneInfo.setId(uuid);
		//我要获取当前的日期
        Date date = new Date();
        //设置要获取到什么样的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //获取String类型的时间
        String createdate = sdf.format(date);
        sayOneInfo.setExtOne(createdate);
		sayOneInfo.setBrowseNumber(0);
		//将浏览人数添加到redis
		redisTemplate.opsForValue().set(uuid+"count",0);
		
		int i = sayInfoMapper.insert(sayOneInfo);
		if(i==1){
			return "添加成功";
		}else {
			return "添加失败";
		}
	}
	
	

}
