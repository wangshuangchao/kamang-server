package com.mugua.core.dynamic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.common.util.KMRandomUtils;
import com.mugua.core.card.pojo.CardVo;
import com.mugua.core.dynamic.mapper.DynamicInfoMapper;
import com.mugua.core.dynamic.pojo.DynamicInfo;
import com.mugua.core.dynamic.pojo.DynamicInfoExample;
import com.mugua.core.dynamic.service.DynamicService;
import com.mugua.core.goods.mapper.GoodsMapper;
import com.mugua.core.goods.pojo.Goods;
import com.mugua.core.product.mapper.ProductInfoMapper;
import com.mugua.core.product.pojo.ProductInfo;
import com.mugua.core.userInfo.mapper.UserInfoMapper;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.qichacha.mapper.CompanyMapper;
import com.mugua.qichacha.pojo.Company;

@Service
@Transactional
public class DynamicServiceImpl implements DynamicService {

	@Autowired
	private DynamicInfoMapper dynamicMapper;
	@Autowired
	private ProductInfoMapper productMapper;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private UserInfoMapper  userInfoMapper ;

	@Autowired
	private GoodsMapper goodsMapper;
	@Override
	public ResultInfo<Object> getDetail(String id) {
		ResultInfo<Object> result=new ResultInfo<>();
		result.setCode("1001");
		result.setMsg("参数不正确");
		if(id==null){
			return result;
		}
		DynamicInfo dynamicInfo = dynamicMapper.selectByPrimaryKey(id);
		if(dynamicInfo==null){
			return result;
		}
		if ("最新入驻".equals(dynamicInfo.getDynamicTitle())) {
			CardVo card=new CardVo();
			UserInfo userInfo = userInfoMapper.selectByPrimaryKey(dynamicInfo.getCardId());
			if(userInfo==null){
				return result;
			}
			//封装创建时间
			Date createTime =  userInfo.getCreateTime();
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if(createTime!=null){
				String format = formatter.format(createTime);
				card.setCreateTimes(format);
			}
			BeanUtils.copyProperties(userInfo, card);
			String goodsId1 = userInfo.getProductUrlOne();
			if(goodsId1!=null && goodsId1!=""){
				Goods goods = goodsMapper.selectById(goodsId1);
				card.setGoodsPhoto1(goods.getPhoto1());
			}
			String goodsId2 = userInfo.getProductUrlTwo();
			if(goodsId2!=null && goodsId2!=""){
				Goods goods2 = goodsMapper.selectById(goodsId2); 
				card.setGoodsPhoto2(goods2.getPhoto1());
			}
			result.setCode("1000");
			result.setMsg("获取成功");
			result.setData(card);
			return result;
		} else if ("产品动态".equals(dynamicInfo.getDynamicTitle())) {
			String productId = dynamicInfo.getProductId();
			if(productId==null){
				return result;
			}
			ProductInfo productInfo = productMapper.selectByPrimaryKey(productId);
			if(productInfo==null){
				return result;
			}
			Company company = companyMapper.selectById(productInfo.getAffiliatedCompany());
			if(company==null){
				return result;
			}
			productInfo.setAffiliatedCompany(company.getName());
			result.setCode("1000");
			result.setMsg("获取成功");
			result.setData(productInfo);
			return result;
		} else {
			return result;
		}
	}

	@Override
	public List<DynamicInfo> getAll() {
		DynamicInfoExample example = new DynamicInfoExample();
		List<DynamicInfo> list = dynamicMapper.selectByExample(example);
		if (list != null) {
			return list;
		}
		return null;
	}

	@Override
	public String addDynamic(DynamicInfo dynamicInfo) {
		dynamicInfo.setDynamicId(KMRandomUtils.getRandomAlphamericStr(8));
		int i = dynamicMapper.insert(dynamicInfo);
		if (i == 1) {
			return "添加成功";
		} else {
			return "添加失败";

		}
	}

	@Override
	public String updateDynamic(DynamicInfo dynamicInfo) {
		int i = dynamicMapper.updateByPrimaryKey(dynamicInfo);
		if (i == 1) {
			return "修改成功";
		} else {
			return "修改失败";
		}
	}

	@Override
	public String deleteDynamic(String dynamicId) {
		int i = dynamicMapper.deleteByPrimaryKey(dynamicId);
		if (i == 1) {
			return "删除成功";
		} else {
			return "删除失败";
		}
	}

	@Override
	public String deleteDynamics(String dynamicIds) {
		if (dynamicIds != null) {
			String[] ids = dynamicIds.split(",");
			for (String id : ids) {
				if(dynamicMapper.selectByPrimaryKey(id)!=null){
					dynamicMapper.deleteByPrimaryKey(id);
				}
			}
			return "删除成功";
		}
		return "删除失败";
	}

}
