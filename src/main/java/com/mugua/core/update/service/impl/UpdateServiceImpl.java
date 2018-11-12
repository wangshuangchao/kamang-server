package com.mugua.core.update.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.update.mapper.UpdateInfoMapper;
import com.mugua.core.update.pojo.UpdateInfo;
import com.mugua.core.update.service.UpdateService;
@Service
public class UpdateServiceImpl implements UpdateService {

	@Autowired
	private UpdateInfoMapper updateMapper;

	@Override
	public ResultInfo<UpdateInfo> getUpdateInfo() {
		ResultInfo<UpdateInfo> result=new ResultInfo<>();
		UpdateInfo updateInfo = updateMapper.getUpdateInfo();
		if(updateInfo!=null){
			result.setCode("1000");
			result.setMsg("获取成功");
			result.setData(updateInfo);
			return result;
		}
		result.setCode("1001");
		result.setMsg("获取失败");
		return result;
	}
	
	
}
