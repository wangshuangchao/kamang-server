package com.mugua.core.pay.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.mgorder.pojo.MgOrder;
import com.mugua.core.pay.order.pojo.Order;
import com.mugua.core.pay.order.pojo.OrderVo;
import com.mugua.core.pay.order.pojo.OrderWo;
import com.mugua.core.pay.service.OrderService;

@RestController
@RequestMapping(value = "/mgshop/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/getAll")
	public ResultInfo<OrderWo> getAll(String userId) {
		ResultInfo<OrderWo> result = orderService.getAll(userId);
		return result;
	}

	@PostMapping("/deleteOrder")
	public ResultInfo<String> deleteOrder(String id) {
		Long orderId = Long.parseLong(id);
		ResultInfo<String> result = orderService.deleteOrder(orderId);
		return result;
	}

	@GetMapping("/getAllOrder")
	public List<Order> getAllOrder() {
		List<Order> result = orderService.getAllOrder();
		return result;
	}
}
