package com.mugua.core.sayone.service;

import java.util.List;

import com.mugua.core.index.pojo.SayOneVo;
import com.mugua.core.sayone.pojo.SayOneInfo;

public interface SayOneService {

	List<SayOneVo> getAll();
	
	List<SayOneInfo> getPaging();
	
	SayOneInfo getDetail(String id);

	List<SayOneVo> getList(int page);
	

}
