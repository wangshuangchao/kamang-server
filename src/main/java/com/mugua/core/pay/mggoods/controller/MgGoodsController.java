package com.mugua.core.pay.mggoods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.mggoods.pojo.GoodsVo;
import com.mugua.core.pay.mggoods.pojo.MgGoods;
import com.mugua.core.pay.mggoods.service.MggoodsService;

@RestController
@RequestMapping(value="/mgshop/goods")
public class MgGoodsController {

	@Autowired
	private MggoodsService mgService;
	
	
	@PostMapping("/addGoods")
	public ResultInfo<String> addGoods(MgGoods goods){
		ResultInfo<String>  result=mgService.addGoods(goods);
		return result;
	}
	
	@GetMapping("/getByUid")
	public ResultInfo<GoodsVo> getByUid(String merchant){
		ResultInfo<GoodsVo> result=mgService.getByUid(merchant);
				return result;
	}
	@GetMapping("/getAll")
	public List<MgGoods> getAll(){
		List<MgGoods> result=mgService.getAll();
		return result;
	}
	
	@PostMapping("/updateGoods")
	public ResultInfo<String> updateGoods(MgGoods goods){
		ResultInfo<String> result=mgService.updateGoods(goods);
		return result;
	}
	@PostMapping("/deleteGoods")
	public ResultInfo<String> deleteGoods(String id){
		
		ResultInfo<String> result=mgService.deleteGoods(id);
		return result;
	}
	@GetMapping("/getLimit")
	public ResultInfo<Integer> getLimitid(String userId,String goodsId){
		ResultInfo<Integer> result=mgService.getLimit(userId,goodsId);
		return result;
	}
	
	@PostMapping("/trunCertification")
	public int trunCertification(String goodsId,int isCertification){
		int i=mgService.trunCertification(goodsId,isCertification);
		return i;
	}
}
