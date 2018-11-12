package com.mugua.core.brokenlist.service;

import java.util.List;

import com.mugua.core.brokenlist.pojo.BrokenlistInfo;
import com.mugua.core.brokenlist.pojo.BrokenlistVo;

public interface BrokenlistService {

	List<BrokenlistVo> getList();


	List<BrokenlistInfo> searchList(String keyword);

	List<BrokenlistInfo> getDetail(String name);

}
