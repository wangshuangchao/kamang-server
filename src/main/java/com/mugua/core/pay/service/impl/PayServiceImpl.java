package com.mugua.core.pay.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.common.util.IdWorker;
import com.mugua.core.pay.mggoods.mapper.MgGoodsMapper;
import com.mugua.core.pay.order.mapper.OrderMapper;
import com.mugua.core.pay.order.pojo.Order;
import com.mugua.core.pay.pojo.PayVo;
import com.mugua.core.pay.service.PayService;

@Service
public class PayServiceImpl implements PayService {

	@Autowired
	private WxPayService wxService;

	@Autowired
	private IdWorker idWorker;

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private MgGoodsMapper goodsMapper;

	@Autowired
	private AlipayClient client;// 支付宝请求sdk客户端

	/*
	 * @Value("${ALI_NOTIFY_URL}") private String ALI_NOTIFY_URL;//支付宝回调
	 * 
	 * @Value("${WX_NOTIFY_URL}") private String WX_NOTIFY_URL;//微信回调
	 */
	@Override
	public ResultInfo<WxPayUnifiedOrderResult> unifiedOrder(PayVo payVo) {
		ResultInfo<WxPayUnifiedOrderResult> result = new ResultInfo<>();
		// 判断是否能够购买足够数量
		Integer temp = 0;
		// 获取goodsId
		String goodsId = payVo.getGoodsId();
		// 获取库存
		int num = goodsMapper.getNumById(goodsId);
		// 判断商品是否限购
		Integer isLimit = goodsMapper.getISLimit(goodsId);
		if (isLimit == 1) {
			// 获取限购数量
			Integer limitid = goodsMapper.getLimitById(goodsId);
			String userId = payVo.getUserId();
			// 查询历史购买数量
			List<Order> list = orderMapper.selectByGoodsId(userId, goodsId);
			if (!list.isEmpty()) {
				for (Order order : list) {
					temp += order.getGoodsNum();
				}

			} // 判断这次下单与历史总数是否超过限制
			temp += payVo.getGoodsNum();
			if (temp > limitid) {
				result.setCode("1001");
				result.setMsg("超过限购数量");
				result.setData(null);
				return result;
			}
		}

		// 减去商品库存量
		Integer goodsNum = payVo.getGoodsNum();
		num = num - goodsNum;
		goodsMapper.minusNum(num, goodsId);
		Order order = new Order();
		// 封装数据
		BeanUtils.copyProperties(payVo, order);
		// 生成订单号
		long id = idWorker.nextId();
		order.setId(id);
		Date createTime = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		order.setCreateTime(new Date());
		order.setPaymentType("1");// 支付类型 1为微信支付,2为支付宝
		order.setPayStatus("");
		order.setShippingCode("");
		order.setShippingName("");
		order.setPayStatus("0");
		order.setExt(goodsId);// 备用字段,商品id
		int i = orderMapper.addOrder(order);
		// int i = orderMapper.insert(order);
		if (i != 1) {
			result.setCode("1001");
			result.setMsg("下单失败");
			result.setData(null);
			return result;
		} else {
			// 生成订单
			WxPayUnifiedOrderRequest request = new WxPayUnifiedOrderRequest();
			Integer totalFee = (int) (payVo.getTotalFee() * 100);
			request.setOutTradeNo(id + "");
			request.setTotalFee(totalFee);
			request.setSpbillCreateIp(payVo.getIp());
			request.setTradeType("APP");
			request.setBody(payVo.getGoodsDetail());
			// request.setNotifyUrl(WX_NOTIFY_URL);
			// request.setNotifyUrl("https://www.baidu.com");
			request.setNotifyUrl("https://api.ikamang.com/mgshop/pay/Wxnotify");
			WxPayUnifiedOrderResult orderResult;
			try {

				orderResult = wxService.unifiedOrder(request);

				result.setCode("1000");
				result.setData(orderResult);
				result.setMsg("下单成功");
				return result;
			} catch (WxPayException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result.setCode("1001");
				result.setMsg("下单失败");
				result.setData(null);
				return result;
			}
		}
	}

	public ResultInfo<String> getOrderStr(PayVo payVo) {
		ResultInfo<String> result = new ResultInfo<>();

		// 判断是否能够购买足够数量
		Integer temp = 0;
		// 获取goodsId
		String goodsId = payVo.getGoodsId();
		int num = goodsMapper.getNumById(goodsId);
		// 判断商品是否限购
		Integer isLimit = goodsMapper.getISLimit(goodsId);
		if (isLimit == 1) {
			// 获取限购数量
			Integer limitid = goodsMapper.getLimitById(goodsId);
			String userId = payVo.getUserId();
			// 查询历史购买数量
			List<Order> list = orderMapper.selectByGoodsId(userId, goodsId);
			if (!list.isEmpty()) {
				for (Order order : list) {
					temp += order.getGoodsNum();
				}

			} // 判断这次下单与历史总数是否超过限制
			temp += payVo.getGoodsNum();
			if (temp > limitid) {
				result.setCode("1001");
				result.setMsg("超过限购数量");
				result.setData(null);
				return result;
			}
		}

		// 减去商品库存量
		Integer goodsNum = payVo.getGoodsNum();
		num = num - goodsNum;
		goodsMapper.minusNum(num, goodsId);

		Order order = new Order();
		// 封装数据
		BeanUtils.copyProperties(payVo, order);
		// 生成订单号
		long id = idWorker.nextId();
		order.setId(id);
		Date createTime = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		order.setCreateTime(new Date());
		order.setPaymentType("2");// 支付类型 1为微信支付,2为支付宝
		order.setPayStatus("");
		order.setShippingCode("");
		order.setShippingName("");
		order.setPayStatus("0");
		order.setExt(goodsId);
		int i = orderMapper.addOrder(order);
		// int i = orderMapper.insert(order);
		if (i != 1) {
			result.setCode("1001");
			result.setMsg("下单失败");
			result.setData(null);
			return result;
		} else {
			JSONObject data = new JSONObject();
			data.put("out_trade_no", id); // 商户订单号
			data.put("product_code", "QUICK_MSECURITY_PAY"); // 产品码, APP支付
			data.put("total_amount", payVo.getTotalFee()); // 订单金额
			data.put("subject", payVo.getGoodsDetail()); // 订单标题
			// APP支付
			AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
			// request.setNotifyUrl(ALI_NOTIFY_URL); // 异步通知地址
			request.setNotifyUrl("https://api.ikamang.com/mgshop/pay/notify");
			// // 异步通知地址
			// request.setNotifyUrl("https://www.baidu.com"); // 异步通知地址
			request.setBizContent(data.toJSONString()); // 业务参数
			try {
				AlipayTradeAppPayResponse response = client.sdkExecute(request);
				String body = client.sdkExecute(request).getBody();
				System.out.println(body);
				result.setCode("1000");
				result.setData(body);
				result.setMsg("获取成功");
				return result;
			} catch (AlipayApiException e) {
				e.printStackTrace();
				System.out.println("支付宝下单错误" + e.getMessage());
				result.setCode("1001");
				result.setMsg("获取失败");
				result.setData(e.getMessage());
				return result;
			}
		}
	}

	@Override
	public int updateOrder(Long orderId) {
		long id = orderId;
		int i = orderMapper.upadateOrder(id);
		return i;
	}

	@Override
	public WxPayOrderNotifyResult parseOrderNotifyResult(String xmlData) {
		WxPayOrderNotifyResult result;
		try {
			result = wxService.parseOrderNotifyResult(xmlData);
			return result;
		} catch (WxPayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}