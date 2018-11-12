package com.mugua.core.apply.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.apply.mapper.ApplyMapper;
import com.mugua.core.apply.pojo.Apply;
import com.mugua.core.apply.pojo.ApplyExample;
import com.mugua.core.apply.pojo.ApplyExample.Criteria;
import com.mugua.core.apply.service.ApplyService;
import com.mugua.core.vote.mapper.VoteMapper;
import com.mugua.core.vote.pojo.Vote;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyMapper applyMapper;
	@Autowired
	private VoteMapper voteMapper;

	@Override
	public List<Apply> getAll() {
		ApplyExample example = new ApplyExample();
		//根据票数排序
		//example.setOrderByClause("num DESC,id ASC");
		List<Apply> result = applyMapper.selectByExample(example);
		return result;
	}

	@Override
	public ResultInfo<String> add(Apply apply) {
		ResultInfo<String> result = new ResultInfo<>();
		//判断是否已经报名
		String uid = apply.getUid();
		ApplyExample example = new ApplyExample();
		Criteria criteria = example.or().andUidEqualTo(uid);
		List<Apply> list = applyMapper.selectByExample(example);
	    if(!list.isEmpty()){
	    	Apply appl= list.get(0);
	    	Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			appl.setUtime(sdf.format(date));
			appl.setNum(0);
			int j = applyMapper.updateByPrimaryKeySelective(appl);
			if(j==1){
				result.setCode("1000");
				result.setMsg("报名成功");
				result.setData("成功");
				return result;
			}else{
				result.setCode("1001");
				result.setMsg("报名失败");
				result.setData("失败");
				return result;
			}
	    }
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		apply.setUtime(sdf.format(date));
		apply.setNum(0);
		int i = applyMapper.insert(apply);
		if (i != 1) {
			result.setCode("1001");
			result.setMsg("报名失败");
			return result;
		}
		result.setCode("1000");
		result.setMsg("报名成功");
		result.setData("成功");
		return result;
	}

	@Override
	public String vote(String openid, Integer id) {
		// 判断是否投过票
		Vote vot = voteMapper.selectByPrimaryKey(openid);
		// 如果不为空
		if (vot != null) {
			Integer poll = vot.getPoll();
			// 判断是否投过3票,小于3可以继续投票
			if (poll < 3) {
				vot.setPoll(poll + 1);
				int i = voteMapper.updateByPrimaryKeySelective(vot);
				Apply apply = applyMapper.selectByPrimaryKey(id);
				Integer num = apply.getNum();
				apply.setNum(num + 1);
				int j = applyMapper.updateByPrimaryKeySelective(apply);
				if (i == 1 && j == 1) {
					return "1";
				} else {
					return "2";
				}
			} else {
				return "3";
			}
			//如果不存在,则创建
		}else{
			Vote vo=new Vote();
			vo.setWechatid(openid);
			vo.setPoll(1);
			int x = voteMapper.insert(vo);
			Apply apply = applyMapper.selectByPrimaryKey(id);
			Integer num = apply.getNum();
			apply.setNum(num + 1);
			int y = applyMapper.updateByPrimaryKeySelective(apply);
			if(x==1&&y==1){
				return "1";
			}else {
				return "2";
			}
		}
	}
}
