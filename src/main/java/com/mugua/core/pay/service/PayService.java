package com.mugua.core.pay.service;

import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.pojo.PayVo;

public interface PayService {

	ResultInfo<WxPayUnifiedOrderResult> unifiedOrder(PayVo payVo);

	ResultInfo<String> getOrderStr(PayVo payVo);

	int updateOrder(Long orderId);

	WxPayOrderNotifyResult parseOrderNotifyResult(String xmlData);

}
