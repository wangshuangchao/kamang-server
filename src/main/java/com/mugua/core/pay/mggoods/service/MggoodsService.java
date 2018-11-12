package com.mugua.core.pay.mggoods.service;


import java.util.List;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.mgshop.vo.MgGoodsVo;
import com.mugua.core.pay.mggoods.pojo.GoodsVo;
import com.mugua.core.pay.mggoods.pojo.MgGoods;

public interface MggoodsService {

	ResultInfo<MgGoodsVo> getIndex(int startRow);

	ResultInfo<String> addGoods(MgGoods goods);

	ResultInfo<GoodsVo> getByUid(String uid);

	ResultInfo<String> updateGoods(MgGoods goods);

	ResultInfo<String> deleteGoods(String id);

	ResultInfo<Integer> getLimit(String userId, String goodsId);

	int trunCertification(String goodsId, int isCertification);

	List<MgGoods> getAll();

}
