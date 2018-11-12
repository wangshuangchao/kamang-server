package com.mugua.core.ask.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.ask.mapper.AskMapper;
import com.mugua.core.ask.pojo.Ask;
import com.mugua.core.ask.service.AskService;

@Service
public class AskServiceImpl implements AskService {

	@Autowired
	private AskMapper askMapper;
	@Override
	public ResultInfo<String> addAsk(Ask ask) {
		ask.setCreateTime(new Date());
		ResultInfo<String> result=new ResultInfo<>();
		int i = askMapper.insertAsk(ask);
		if(i==1){
			result.setCode("1000");
			result.setData("添加成功");
			result.setMsg("成功");
			return result;
		}
		result.setCode("1001");
		result.setData("添加失败");
		result.setMsg("失败");
		return result;
	}
	@Override
	public ResultInfo<Ask> getAsk(String userId) {
		ResultInfo<Ask> result=new ResultInfo<>();
		Ask ask = askMapper.selectById(userId);
		if(ask!=null){
			result.setCode("1000");
			result.setData(ask);
			result.setMsg("获取成功");
			return result;
		}
		result.setCode("1001");
		result.setMsg("获取失败");
		return result;
	}

	
}
