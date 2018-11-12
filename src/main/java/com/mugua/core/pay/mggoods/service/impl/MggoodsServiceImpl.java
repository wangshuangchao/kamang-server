package com.mugua.core.pay.mggoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.common.util.IdWorker;
import com.mugua.core.mgshop.vo.MgGoodsVo;
import com.mugua.core.pay.mggoods.mapper.MgGoodsMapper;
import com.mugua.core.pay.mggoods.pojo.GoodsVo;
import com.mugua.core.pay.mggoods.pojo.MgGoods;
import com.mugua.core.pay.mggoods.pojo.MgGoodsExample;
import com.mugua.core.pay.mggoods.service.MggoodsService;
import com.mugua.core.pay.order.mapper.OrderMapper;
import com.mugua.core.pay.order.pojo.Order;
@Service
public class MggoodsServiceImpl implements MggoodsService {

	@Autowired
	private MgGoodsMapper goodsMapper;
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public ResultInfo<MgGoodsVo> getIndex(int startRow) {
		ResultInfo<MgGoodsVo> result=new ResultInfo<>();
		MgGoodsVo goodsVo=new MgGoodsVo();
		MgGoodsExample example=new MgGoodsExample();
		example.createCriteria().andIsShotEqualTo(1).andIsCertificationEqualTo("1");
//		example.setStartRow(startRow);
//		example.setPageSize(10);
		/*  
		 * 第一个参数是第几页；第二个参数是每页显示条数。  
		 */
		PageHelper.startPage(startRow,10);
		List<MgGoods> hot = goodsMapper.selectByExample(example);
		List<MgGoods> commend = goodsMapper.selectByCommend();
		goodsVo.setHot(hot);
		goodsVo.setCommend(commend);
		result.setData(goodsVo);
		result.setCode("1000");
		result.setMsg("获取成功");
		return result;
	}

	@Autowired
	IdWorker idWork;
	
	@Override
	public ResultInfo<String> addGoods(MgGoods goods) {
		long nextId = idWork.nextId();
		String id=nextId+"";
		goods.setId(id);
	    if("null".equals(goods.getPhoto1())||goods.getPhoto1()==null){
			goods.setPhoto1("");
		}
		if("null".equals(goods.getPhoto2())||goods.getPhoto2()==null){
			goods.setPhoto2("");
		}
		if("null".equals(goods.getPhoto3())||goods.getPhoto3()==null){
			goods.setPhoto3("");
		}
		if("null".equals(goods.getPhoto4())||goods.getPhoto4()==null){
			goods.setPhoto4("");
		}
		if("null".equals(goods.getPhoto5())||goods.getPhoto5()==null){
			goods.setPhoto5("");
		}
		if("null".equals(goods.getPhoto6())||goods.getPhoto6()==null){
			goods.setPhoto6("");
		}
		if("null".equals(goods.getPhoto7())||goods.getPhoto7()==null){
			goods.setPhoto7("");
		}
		goods.setIsCertification("0");
		goods.setIsShot(1);
		goods.setIsRecommend(0);
		ResultInfo<String> result=new ResultInfo<>();
		int i = goodsMapper.insert(goods);
		if(i!=1){
			result.setCode("1001");
			result.setData("添加失败");
			result.setMsg("失败");
			return result;
		}
		result.setCode("1000");
		result.setData("添加成功");
		result.setMsg("成功");
		return result;
	}

	@Override
	public ResultInfo<GoodsVo> getByUid(String uid) {
		ResultInfo<GoodsVo> result=new ResultInfo<>();
		GoodsVo goodVo=new GoodsVo();
		List<MgGoods> list = goodsMapper.getByUid(uid);
		goodVo.setList(list);
		if(list.isEmpty()){
			result.setCode("1001");
			result.setMsg("未上传商品");
			result.setData(goodVo);
			return result;
		}
		result.setCode("1000");
		result.setMsg("获取成功");
		result.setData(goodVo);
		return result;
	}

	@Override
	public ResultInfo<String> updateGoods(MgGoods goods) {
		ResultInfo<String> result=new ResultInfo<>();
		  if("null".equals(goods.getPhoto1())||goods.getPhoto1()==null){
				goods.setPhoto1("");
			}
			if("null".equals(goods.getPhoto2())||goods.getPhoto2()==null){
				goods.setPhoto2("");
			}
			if("null".equals(goods.getPhoto3())||goods.getPhoto3()==null){
				goods.setPhoto3("");
			}
			if("null".equals(goods.getPhoto4())||goods.getPhoto4()==null){
				goods.setPhoto4("");
			}
			if("null".equals(goods.getPhoto5())||goods.getPhoto5()==null){
				goods.setPhoto5("");
			}
			if("null".equals(goods.getPhoto6())||goods.getPhoto6()==null){
				goods.setPhoto6("");
			}
			if("null".equals(goods.getPhoto7())||goods.getPhoto7()==null){
				goods.setPhoto7("");
			}
			goods.setIsCertification("0");
			goods.setIsShot(1);
			goods.setIsRecommend(0);
			int i = goodsMapper.updateByPrimaryKey(goods);
			if(i!=1){
				result.setCode("1001");
				result.setData("修改失败");
				result.setMsg("失败");
				return result;
			}
			result.setCode("1000");
			result.setData("修改成功");
			result.setMsg("成功");
			return result;
	}

	@Override
	public ResultInfo<String> deleteGoods(String id) {
		ResultInfo<String> result=new ResultInfo<>();
		int i = goodsMapper.deleteByPrimaryKey(id);
		if(i!=1){
			result.setCode("1001");
			result.setData("删除失败");
			result.setMsg("失败");
			return result;
		}
		result.setCode("1000");
		result.setData("删除成功");
		result.setMsg("成功");
		return result;
	}

	@Override
	public ResultInfo<Integer> getLimit(String userId, String goodsId) {
		List<Order> list = orderMapper.selectByGoodsId(userId, goodsId);
		Integer limitid=0;
		if(!list.isEmpty()){
			for (Order order : list) {
				Integer num = order.getGoodsNum();
				limitid+=num;
			}
		}
		Integer limit = goodsMapper.getLimitById(goodsId);
		Integer temp=limit-limitid;
		if(temp<0){
			ResultInfo<Integer> result=new ResultInfo<>();
			result.setCode("1001");
			result.setMsg("已经超过上限");
			result.setData(0);
			return result;
			
		}
		ResultInfo<Integer> result=new ResultInfo<>();
		result.setCode("1000");
		result.setData(temp);
		result.setMsg("获取成功");
		return result;
	}

	@Override
	public int trunCertification(String goodsId,int isCertification) {
		int i=goodsMapper.trunCertification(isCertification,goodsId);
		return i;
	}

	@Override
	public List<MgGoods> getAll() {
		MgGoodsExample example=new MgGoodsExample();
		List<MgGoods> result = goodsMapper.selectByExample(example);
		return result;
	}


}
