package com.mugua.core.goods.service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.goods.pojo.Goods;

public interface GoodsService {

	String addGoods(Goods goods);

	ResultInfo<Goods> getGoods(String id);

}
