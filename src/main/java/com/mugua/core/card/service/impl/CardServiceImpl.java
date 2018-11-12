package com.mugua.core.card.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.aliyun.util.AliUtil;
import com.mugua.core.card.pojo.CardShow;
import com.mugua.core.card.pojo.CardVo;
import com.mugua.core.card.service.CardService;
import com.mugua.core.goods.mapper.GoodsMapper;
import com.mugua.core.goods.pojo.Goods;
import com.mugua.core.userInfo.mapper.UserInfoMapper;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.repository.UserInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CardServiceImpl implements CardService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Autowired
	private GoodsMapper goodsMapper;

	@Autowired
	UserInfoRepository userInfoRepository;

	@Override
	public ResultInfo<CardVo> getCardDetail(String id) {
		ResultInfo<CardVo> result = new ResultInfo<>();
		CardVo card = new CardVo();
		UserInfo userInfo = userInfoMapper.selectById(id);
		// 封装创建时间
		Date createTime = userInfo.getCreateTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = formatter.format(createTime);
		card.setCreateTimes(format);
		BeanUtils.copyProperties(userInfo, card);
		String goodsId1 = userInfo.getProductUrlOne();
		if (goodsId1 != null && goodsId1 != "") {
			Goods goods = goodsMapper.selectById(goodsId1);
			card.setGoodsPhoto1(goods.getPhoto1());
		} else {
			card.setGoodsPhoto1("");
		}
		String goodsId2 = userInfo.getProductUrlTwo();
		if (goodsId2 != null & goodsId2 != "") {
			Goods goods2 = goodsMapper.selectById(goodsId2);
			card.setGoodsPhoto2(goods2.getPhoto1());
		} else {
			card.setGoodsPhoto2("");
		}
		// 二维码为空
		card.setQrcode("");
		result.setCode("1000");
		result.setData(card);
		result.setMsg("获取成功");
		return result;
	}

	@Override
	public String bulidCard(CardVo cardVo, String videoId) {
		if(cardVo.getId()==null){
			return "创建失败";
		}
		UserInfo userInfo = userInfoMapper.selectById(cardVo.getId());
		if(userInfo==null){
			return "创建失败";
		}
		try {
			// 封装数据
			// 所有数据做好非空判断
			if (cardVo.getProductUrlOne() != null) {
				userInfo.setProductUrlOne(cardVo.getProductUrlOne());
			}
			if (cardVo.getProductUrlTwo() != null) {
				userInfo.setProductUrlTwo(cardVo.getProductUrlTwo());
			}
			if (cardVo.getMicroblog() != null) {
				userInfo.setMicroblog(cardVo.getMicroblog());
			}
			if (cardVo.getOrganizationCode() != null) {
				userInfo.setOrganizationCode(cardVo.getOrganizationCode());
			}
			if (cardVo.getLegalPersonName() != null) {
				userInfo.setLegalPersonName(cardVo.getLegalPersonName());
			}
			if (cardVo.getRegisteredAssets() != null) {
				userInfo.setRegisteredAssets(cardVo.getRegisteredAssets());
			}
			if (cardVo.getCompanyAddr() != null) {
				userInfo.setCompanyAddr(cardVo.getCompanyAddr());
			}
			if (cardVo.getLegalPersonPhone() != null) {
				userInfo.setLegalPersonPhone(cardVo.getLegalPersonPhone());
			}
			if (cardVo.getScopeOfBusiness() != null) {
				userInfo.setScopeOfBusiness(cardVo.getScopeOfBusiness());
			}
			if (cardVo.getPhotoUrl() != null) {
				userInfo.setPhotoUrl(cardVo.getPhotoUrl());
			}
			if (cardVo.getIsCentification() != null) {
				userInfo.setIsCentification(cardVo.getIsCentification());
			}
			if (cardVo.getIntroduceCompany() != null) {
				userInfo.setIntroduceCompany(cardVo.getIntroduceCompany());
			}
			if (cardVo.getCompanyVidio() != null) {
				userInfo.setCompanyVidio(cardVo.getCompanyVidio());
			}
			// 判断是否重新更换了视频
			if (videoId != null && videoId != "") {
				String accessKeyId = "LTAIbLWWSl6I22le";
				String accessKeySecret = "Hn8gsoQsUAQ7hKMzZi42TExYtRlzkp";
				DefaultProfile profile = DefaultProfile.getProfile("cn-beijing", accessKeyId, accessKeySecret);
				DefaultAcsClient client = new DefaultAcsClient(profile);
				GetPlayInfoResponse playInfo = AliUtil.getPlayInfo(client, videoId);
				userInfo.setCompanyVidio(playInfo.getPlayInfoList().get(0).getPlayURL());
			}
			// 是否生成过名片
			userInfo.setExts("1");
			// 创建时间转换成date类型
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String createTimes = cardVo.getCreateTimes();
			if ( null != createTimes && !"".equals(createTimes)) {
				Date createTime = formatter.parse(cardVo.getCreateTimes());
				userInfo.setCreateTime(createTime);
			}
			// 更新索引
			userInfoRepository.delete(userInfo.getId());
			userInfoRepository.save(userInfo);
			// 更新数据库
			int i = userInfoMapper.updateByPrimaryKeySelective(userInfo);
			if (i == 1) {
				return "创建成功";
			} else {
				return "创建失败";
			}
		} catch (ParseException e) {
			log.error(">>>>>>>>>>>>>>>>");
			log.error(e.getMessage());
			e.printStackTrace();
			return "创建失败";
		}
	}

	@Value("${CARD_URL}")
	private String CARD_URL;

	@Override
	public ResultInfo<CardShow> getCardShow(String id) {
		ResultInfo<CardShow> result = new ResultInfo<>();
		CardShow cardShow = new CardShow();
		if (id != null && !"".equals(id)) {
			UserInfo userInfo = userInfoMapper.selectById(id);
			if (userInfo != null) {
				BeanUtils.copyProperties(userInfo, cardShow);
				cardShow.setQRcode(CARD_URL + "?id=" + id);
				result.setCode("1000");
				result.setData(cardShow);
				result.setMsg("获取成功");
				return result;
			} else {
				result.setCode("1001");
				result.setData(cardShow);
				result.setMsg("获取失败");
				return result;
			}
		} else {
			result.setCode("1001");
			result.setData(cardShow);
			result.setMsg("获取失败");
			return result;
		}
	}

	@Override
	public ResultInfo<String> creatCard(CardVo cardVo, String videoId) {
		ResultInfo<String> result = new ResultInfo<>();
		String card = bulidCard(cardVo, videoId);
		if ("创建成功".equals(card)) {
			result.setCode("1000");
			result.setData(card);
			result.setMsg("创建成功");
			return result;
		} else {
			result.setCode("1001");
			result.setData(card);
			result.setMsg("创建失败");
			return result;
		}
	}

}
