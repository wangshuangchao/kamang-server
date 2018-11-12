package com.mugua.core.pay.controller;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.binarywang.wxpay.bean.notify.WxPayNotifyResponse;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.pojo.PayVo;
import com.mugua.core.pay.service.PayService;

import lombok.extern.slf4j.Slf4j;
import net.guerlab.sdk.alipay.controller.AlipayAbstractController;

@RestController
@RequestMapping(value="/mgshop/pay")
@Slf4j
public class PayController extends AlipayAbstractController {

	
	@Autowired
	private PayService payService;
	
	
	
	@PostMapping("/wxPay")
	public ResultInfo<WxPayUnifiedOrderResult> wxPay(PayVo payVo){
		ResultInfo<WxPayUnifiedOrderResult> result=payService.unifiedOrder(payVo);
		return result;
	}
	
	@PostMapping("/aliPay")
	public ResultInfo<String> getOrderStr(PayVo payVo){
		ResultInfo<String> result=payService.getOrderStr(payVo);
		return result;
	}
	
	//支付宝异步校验订单结果
	@PostMapping("/notify")
	public String notify(HttpServletRequest request) {
		if (!notify0(request.getParameterMap())) {
			log.warn("__________________________"+"验签失败");
			// 这里处理验签失败
			return "failure";
		}
		log.warn(new Date()+"延签成功");
		String tradeNo = request.getParameter("trade_no");// 获取请求参数中的支付宝订单号
		String outTradeNo = request.getParameter("out_trade_no");// 获取请求参数中的商户订单号
		String tradeStatus = request.getParameter("trade_status");// 获取请求参数中支付状态
		log.warn("-------------"+"订单号:"+outTradeNo+"支付宝流水号"+tradeNo+"订单状态"+tradeStatus);
		System.out.println("-------------"+"订单号"+tradeNo+"订单状态"+tradeStatus);
		Long orderId=Long.parseLong(outTradeNo);
		//如果交易未成功
		if(!"TRADE_SUCCESS".equals(tradeStatus)){
			return "failure";
		}
		//判断支付信息
		int i=payService.updateOrder(orderId);
		return "success";
	}
	
	
	//微信异步校验订单结果
		@PostMapping("/Wxnotify")
		public void Wxnotify(@RequestBody String xmlData,WxPayNotifyResponse res) {
			log.warn("回调数据"+xmlData);
			WxPayOrderNotifyResult result=payService.parseOrderNotifyResult(xmlData);
			String resultCode = result.getResultCode();
			log.warn("-----------微信订单信息"+"订单号"+result.getOutTradeNo()+"订单结果"+resultCode);
			//如果交易成功
			if("SUCCESS".equals(resultCode)){
				String outTradeNo = result.getOutTradeNo();
				Long orderId=Long.parseLong(outTradeNo);
				//更新数据库订单信息
				int i=payService.updateOrder(orderId);
				res.setReturnCode("SUCCESS");
			}
			else{
				res.setReturnCode("FAIL");
			}
			
		}
}
