package com.mugua.core.activity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.activity.pojo.Share;
import com.mugua.core.activity.service.ActivityService;
import com.mugua.core.apply.mapper.ApplyMapper;
import com.mugua.core.apply.pojo.Apply;
import com.mugua.core.apply.pojo.ApplyExample;
import com.mugua.core.apply.pojo.ApplyExample.Criteria;
import com.mugua.core.vote.pojo.VoteExample;
@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ApplyMapper applyMapper;

	@Value("${VISIT_URL}")
	private String VISIT_URL;
	@Override
	public ResultInfo<Share> share(String uid) {
		ResultInfo<Share> result=new ResultInfo<>();
		ApplyExample example=new ApplyExample();
		Criteria criteria = example.or().andUidEqualTo(uid);
		List<Apply> list = applyMapper.selectByExample(example);
		if(list!=null){
			Apply apply = list.get(0);
			Integer id = apply.getId();
			Share share =new Share();
			if(0<id && id<10){
				share.setTitle("我正在参与我最喜欢的名片评选活动，请为000"+apply.getId()+"号投票，帮我赢小米扫地机器人");
				
			}
			else if(10<=id && id<100){
				share.setTitle("我正在参与我最喜欢的名片评选活动，请为00"+apply.getId()+"号投票，帮我赢小米扫地机器人");
				
			}else {
				share.setTitle("我正在参与我最喜欢的名片评选活动，请为0"+apply.getId()+"号投票，帮我赢小米扫地机器人");
			}
			share.setPhoto(apply.getPhotourl());
			share.setContent("从名片变迁中，我们能窥见一个企业家/创业者奋斗的艰辛历程和曾经的英雄梦想");
			share.setUrl(VISIT_URL+"/vote/goLoad");
			result.setCode("1000");
			result.setData(share);
			result.setMsg("获取成功");
			return result;
		}
		result.setCode("1001");
		result.setMsg("编号不存在");
		return result;
	}
	
	
}
