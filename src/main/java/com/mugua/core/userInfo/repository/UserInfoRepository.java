package com.mugua.core.userInfo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.mugua.core.userInfo.pojo.UserInfo;
@Repository
public interface UserInfoRepository extends ElasticsearchRepository<UserInfo,String> {

	
}
