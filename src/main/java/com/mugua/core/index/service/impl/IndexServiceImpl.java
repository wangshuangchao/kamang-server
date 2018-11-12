package com.mugua.core.index.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.activity.mapper.ActivityMapper;
import com.mugua.core.activity.pojo.Activity;
import com.mugua.core.dynamic.mapper.DynamicInfoMapper;
import com.mugua.core.dynamic.pojo.DynamicInfo;
import com.mugua.core.dynamic.pojo.DynamicInfoExample;
import com.mugua.core.index.pojo.DynamicVo;
import com.mugua.core.index.pojo.IndexVo;
import com.mugua.core.index.pojo.SayOneVo;
import com.mugua.core.index.service.IndexService;
import com.mugua.core.sayone.mapper.SayOneInfoMapper;
import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.pojo.SayOneInfoExample;
import com.mugua.core.sayone.pojo.SayOneInfoExample.Criteria;
@Service
public class IndexServiceImpl implements IndexService{

	@Autowired
	private SayOneInfoMapper sayOneInfoMapper;
	
	@Autowired
	private DynamicInfoMapper dynamicInfoMapper;
	
	@Autowired
	private ActivityMapper activityMapper;
	
	@Override
	public ResultInfo<IndexVo> index() {
		//查询是否存在活动
		List<Activity> all = activityMapper.getAll();
		Activity activity = all.get(0);
		//查询是否已经报名参加活动
		
		//获取动态信息,分页获取前四条
		PageHelper.startPage(1,4);
		DynamicInfoExample dynamicInfoExamplE=new DynamicInfoExample();
		List<DynamicInfo> dynamics =dynamicInfoMapper.selectByExample(dynamicInfoExamplE);
		List<DynamicVo> dynamicVo=new ArrayList<DynamicVo>();
		for (DynamicInfo dynamicInfo : dynamics) {
			DynamicVo dy=new DynamicVo();
			//将获取的动态内容封装成vo
			BeanUtils.copyProperties(dynamicInfo, dy);
			dynamicVo.add(dy);
		}
		
		//获取新闻类型为1的前四条
		PageHelper.startPage(1,4);
		SayOneInfoExample example=new SayOneInfoExample();
		@SuppressWarnings("unused")
		Criteria criteria=example.or().andPhotoTypeEqualTo("1");
		List<SayOneInfo> sayOnes = sayOneInfoMapper.selectByExample(example);
		List<SayOneVo> sayOneVo=new ArrayList<SayOneVo>();
		//拷贝javaBean
		for (SayOneInfo sayOne : sayOnes) {
			SayOneVo say=new SayOneVo();
			//将获取的动态内容封装成vo
			BeanUtils.copyProperties(sayOne, say);
			//更新浏览人数
			sayOneVo.add(say);
		}
		
		//将获取数据封装在IndexVo
		IndexVo indexVo=new IndexVo();
		//封装数据
		indexVo.setDynamics(dynamicVo);
		indexVo.setSayOnes(sayOneVo);
		indexVo.setActivity(activity);
		ResultInfo<IndexVo> result=new ResultInfo<IndexVo>();
		result.setCode("1000");
		result.setData(indexVo);
		result.setMsg("获取成功");
		return result;
	}

}
