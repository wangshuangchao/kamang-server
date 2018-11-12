package com.mugua.mgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.core.product.pojo.ProductInfo;
import com.mugua.mgt.service.ProductInfoService;

@RestController
@RequestMapping("/app/management/product")
public class ProductController {

	@Autowired
	private ProductInfoService productServiceImpl;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<ProductInfo> getAll(){
		List<ProductInfo> list=productServiceImpl.getAll();
		return list;
	}
	 @RequestMapping(value="/updateState", method = RequestMethod.POST)
	 public void updateState(String id,String state){
		 productServiceImpl.updateState(id,state);
	 }
	 @RequestMapping(value="/deleteProduct", method = RequestMethod.POST)
	 public void deleteProduct(String id){
		 productServiceImpl.deleteProduct(id);
	 }
	 @RequestMapping(value="/deleteProducts", method = RequestMethod.POST)
	 public void deleteProducts(String ids){
		 //System.out.println(ids);
		 productServiceImpl.deleteProducts(ids);
	 }
	 
	 
}
