package com.mugua.core.pay.order.pojo;

import java.util.List;

public class OrderWo {

	private List<OrderVo> OrderVos;

	
	public OrderWo() {
		super();
	}

	public OrderWo(List<OrderVo> orderVos) {
		super();
		OrderVos = orderVos;
	}

	public List<OrderVo> getOrderVos() {
		return OrderVos;
	}

	public void setOrderVos(List<OrderVo> orderVos) {
		OrderVos = orderVos;
	}

	@Override
	public String toString() {
		return "OrderWo [OrderVos=" + OrderVos + "]";
	}
	
}
