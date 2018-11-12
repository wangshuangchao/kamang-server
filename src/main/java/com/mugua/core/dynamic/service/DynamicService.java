package com.mugua.core.dynamic.service;

import java.util.List;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.dynamic.pojo.DynamicInfo;

public interface DynamicService {

	ResultInfo<Object> getDetail(String id);

	List<DynamicInfo> getAll();

	String addDynamic(DynamicInfo dynamicInfo);

	String updateDynamic(DynamicInfo dynamicInfo);

	String deleteDynamic(String dynamicId);

	String deleteDynamics(String dynamicId);

}
