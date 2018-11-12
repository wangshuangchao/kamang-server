package com.mugua.core.apply.service;

import java.util.List;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.apply.pojo.Apply;

public interface ApplyService {

	List<Apply> getAll();

	ResultInfo<String> add(Apply apply);

	String vote(String openid, Integer id);

}
