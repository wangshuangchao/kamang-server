package com.mugua.mgt.service;

import java.util.List;

import com.mugua.core.sayone.pojo.SayOneInfo;

public interface SayService {

	List<SayOneInfo> getNews();

	String deleteNewById(String id);

	String addNews(SayOneInfo sayOneInfo);

}
