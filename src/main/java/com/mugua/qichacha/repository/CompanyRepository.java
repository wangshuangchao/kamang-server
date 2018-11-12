package com.mugua.qichacha.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.mugua.qichacha.pojo.Company;
@Repository
public interface CompanyRepository extends ElasticsearchRepository<Company,String> {

}
