package com.mugua.core.goods.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.common.util.KMRandomUtils;
import com.mugua.core.goods.mapper.GoodsMapper;
import com.mugua.core.goods.pojo.Goods;
import com.mugua.core.goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public String addGoods(Goods goods) {
		String id = KMRandomUtils.getRandomAlphamericStr(8);
		goods.setId(id);
		int i = goodsMapper.saveGoods(goods);
		if (i == 1) {
			return id;
		} else {
			return "失败";
		}
	}

	@Override
	public ResultInfo<Goods> getGoods(String id) {
		Goods goods = goodsMapper.selectById(id);
		ResultInfo<Goods> result = new ResultInfo<>();
		if (goods != null) {
			result.setCode("1000");
			result.setData(goods);
			result.setMsg("获取成功");
			return result;
		}
		result.setCode("1001");
		result.setMsg("获取失败");
		return result;
	}

}
