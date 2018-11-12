package com.mugua.core.brokenlist.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mugua.core.brokenlist.mapper.BrokenlistInfoMapper;
import com.mugua.core.brokenlist.pojo.BrokenlistInfo;
import com.mugua.core.brokenlist.pojo.BrokenlistInfoExample;
import com.mugua.core.brokenlist.pojo.BrokenlistInfoExample.Criteria;
import com.mugua.core.brokenlist.pojo.BrokenlistVo;
import com.mugua.core.brokenlist.repository.BrokenlistRepository;
import com.mugua.core.brokenlist.service.BrokenlistService;

@Service
@SuppressWarnings("unused")
public class BrokenlistServiceImpl implements BrokenlistService {

	@Autowired
	private BrokenlistInfoMapper brodenlistMapper;
	@Autowired
	private BrokenlistRepository brokenRepository;
	@Override
	public List<BrokenlistVo> getList() {
		BrokenlistInfoExample example=new BrokenlistInfoExample();
		PageHelper.startPage(1,9);
		List<BrokenlistInfo> list = brodenlistMapper.selectByExample(example);
		List<BrokenlistVo> result=new ArrayList<BrokenlistVo>();
		//拷贝数据到vo
		for (BrokenlistInfo brokenlistInfo : list) {
			BrokenlistVo brokenlistVo=new BrokenlistVo();
			BeanUtils.copyProperties(brokenlistInfo, brokenlistVo);
			result.add(brokenlistVo);
		}
		return result;
	}
	@Override
	public List<BrokenlistInfo> getDetail(String name) {
		BrokenlistInfoExample example=new BrokenlistInfoExample();
		
		Criteria criteria=example.or().andCompanyEqualTo(name);
		List<BrokenlistInfo> list = brodenlistMapper.selectByExample(example);
		if(list.isEmpty()){
			return null;
		}
		else {
			return list;
		}
	}
	@Override
	public List<BrokenlistInfo> searchList(String keyword) {
		List<BrokenlistInfo> result=new ArrayList<>();
		String queryString=keyword;//搜索关键字
        QueryStringQueryBuilder builder=new QueryStringQueryBuilder(queryString);

        Iterable<BrokenlistInfo> searchResult = brokenRepository.search(builder);
        Iterator<BrokenlistInfo> iterator = searchResult.iterator();
        while(iterator.hasNext()){
        	BrokenlistInfo broken=iterator.next();
        	result.add(broken);
        }
		return result;
	}

}
