package com.mugua.core.mgshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.mgshop.vo.MgGoodsVo;
import com.mugua.core.pay.mggoods.pojo.MgGoods;
import com.mugua.core.pay.mggoods.service.MggoodsService;

@RestController
@RequestMapping(value="/mgshop")
public class MgShopController {

	@Autowired
	private MggoodsService goodsService;
	
	@GetMapping(value="/index")
	public ResultInfo<MgGoodsVo> index(int startRow){
		ResultInfo<MgGoodsVo> result=goodsService.getIndex(startRow);
		return result;
		
	}
}
