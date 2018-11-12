package com.mugua.core.pay.service;

import java.util.List;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.order.pojo.Order;
import com.mugua.core.pay.order.pojo.OrderWo;

public interface OrderService {
	

	ResultInfo<OrderWo> getAll(String userId);

	ResultInfo<String> deleteOrder(Long id);

	List<Order> getAllOrder();
	
}
