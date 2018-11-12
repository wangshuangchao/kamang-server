package com.mugua.core.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.card.pojo.CardShow;
import com.mugua.core.card.pojo.CardVo;
import com.mugua.core.card.service.CardService;

@Controller
@RequestMapping(value="/app/card")
public class CardController {

	@Autowired
	private CardService cardServiceImpl;
		
	@PostMapping(value="/creatCard")
	@ResponseBody
	public ResultInfo<String> creatCard(CardVo cardVo,String videoId){
		ResultInfo<String> result=cardServiceImpl.creatCard(cardVo,videoId);
		return result;
	}
	
	@PostMapping(value="/bulidCard")
	@ResponseBody
	public String bulidCard(CardVo cardVo,String videoId){
		String result=cardServiceImpl.bulidCard(cardVo,videoId);
		return result;
	}
	@PostMapping(value="/updateCard")
	@ResponseBody
	public String updateCard(CardVo cardVo,String videoId){
		String result=cardServiceImpl.bulidCard(cardVo,videoId);
		return result;
	}
	
	//根据Id获取名片信息
	@GetMapping(value="/getCardInfo")
	@ResponseBody
	public ResultInfo<CardVo> getCardInfo(String id){
		ResultInfo<CardVo> result= cardServiceImpl.getCardDetail(id);
		return result;
	}
	//根据Id获取展示名片
	@GetMapping(value="/getCardShow")
	@ResponseBody
	public ResultInfo<CardShow> getCardShow(String id){
		ResultInfo<CardShow> result= cardServiceImpl.getCardShow(id);
		return result;
	}
	
	//生成名片的网页
	@GetMapping(value="/getCardDetail")
	public String getCardDetail(String id,Model model){
		ResultInfo<CardVo> result= cardServiceImpl.getCardDetail(id);
		CardVo vo = result.getData();
		model.addAttribute("card",vo);
		return "card";
	}
	
}
