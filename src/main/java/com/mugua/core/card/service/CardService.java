package com.mugua.core.card.service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.card.pojo.CardShow;
import com.mugua.core.card.pojo.CardVo;

public interface CardService {

	ResultInfo<CardVo> getCardDetail(String id);

	String bulidCard(CardVo cardVo, String videoId);

	ResultInfo<CardShow> getCardShow(String id);

	ResultInfo<String> creatCard(CardVo cardVo, String videoId);


}
