package com.mugua.core.brokenlist.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.mugua.core.brokenlist.pojo.BrokenlistInfo;
@Repository
public interface BrokenlistRepository extends ElasticsearchRepository<BrokenlistInfo,Integer>{

}
