package com.mugua.core.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.goods.pojo.Goods;
import com.mugua.core.goods.service.GoodsService;

@Controller
@RequestMapping(value="/app/goods")
public class GoodsController {

	@Autowired//添加商品
	private GoodsService goodsServiceImpl;
	
	@PostMapping(value="/addGoods")
	@ResponseBody
	public String addGoods(Goods goods){
		String id=goodsServiceImpl.addGoods(goods);
		return id;
	}
	@PostMapping(value="/addGoodz")
	@ResponseBody
	public ResultInfo<String> addGoodz(Goods goods){
		ResultInfo<String> result=new ResultInfo<>();
		
		String id=goodsServiceImpl.addGoods(goods);
		result.setCode("200");
		result.setData(id);
		result.setMsg("获取成功");
		return result;
	}
	
	@GetMapping(value="/getGoods")
	@ResponseBody
	public ResultInfo<Goods> getGoods(String id){
		ResultInfo<Goods> result= goodsServiceImpl.getGoods(id);
		return result;
	}
	@GetMapping(value="/getGoodz")
	public String getGoodz(String id,Model model){
		ResultInfo<Goods> result= goodsServiceImpl.getGoods(id);
		model.addAttribute("goods", result.getData());
		return "goods";
	}
	
}
