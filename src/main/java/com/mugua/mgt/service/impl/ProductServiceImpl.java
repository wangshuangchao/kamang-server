package com.mugua.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.core.product.mapper.ProductInfoMapper;
import com.mugua.core.product.pojo.ProductInfo;
import com.mugua.core.product.pojo.ProductInfoExample;
import com.mugua.mgt.service.ProductInfoService;
@Service
public class ProductServiceImpl implements ProductInfoService{

	@Autowired
	private ProductInfoMapper productMapper;

	@Override
	public List<ProductInfo> getAll() {
		ProductInfoExample example=new ProductInfoExample();
		List<ProductInfo> list = productMapper.selectByExample(example);
		return list;
	}

	@Override
	public void updateState(String id, String state) {
		productMapper.updateState(id, state);
		
	}

	@Override
	public void deleteProduct(String id) {
		productMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteProducts(String ids) {
		String[] idss = ids.split(",");
		for (String id : idss) {
			productMapper.deleteByPrimaryKey(id);
		}
	}
	
}
