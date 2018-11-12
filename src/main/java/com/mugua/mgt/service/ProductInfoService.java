package com.mugua.mgt.service;

import java.util.List;

import com.mugua.core.product.pojo.ProductInfo;


public interface ProductInfoService {

	List<ProductInfo> getAll();

	void updateState(String id, String state);

	void deleteProduct(String id);

	void deleteProducts(String ids);

}
