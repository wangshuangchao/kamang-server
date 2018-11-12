package com.mugua.core.pay.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.order.mapper.OrderMapper;
import com.mugua.core.pay.order.pojo.Order;
import com.mugua.core.pay.order.pojo.OrderExample;
import com.mugua.core.pay.order.pojo.OrderVo;
import com.mugua.core.pay.order.pojo.OrderWo;
import com.mugua.core.pay.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {


	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public ResultInfo<OrderWo> getAll(String userId) {
		ResultInfo<OrderWo> result=new ResultInfo<>();
		List<Order> list = orderMapper.selectByUserId(userId);
		List<OrderVo> orderVos=new ArrayList<>();
		OrderWo orderWo=new OrderWo();
		if(!list.isEmpty() && list!=null){
		for (Order order : list) {
			OrderVo vo=new OrderVo();
			BeanUtils.copyProperties(order, vo);
			vo.setUserId(userId);
			orderVos.add(vo);
		}
		orderWo.setOrderVos(orderVos);
		result.setCode("1000");
		result.setData(orderWo);
		result.setMsg("获取成功");
		return result;
	}else
		result.setCode("1001");
		result.setData(orderWo);
		result.setMsg("获取失败");
		return result;
	}

	@Override
	public ResultInfo<String> deleteOrder(Long id) {
		ResultInfo<String> result=new ResultInfo<>();
		int i = orderMapper.delOrder(id);
		if(i!=1){
			result.setCode("1001");
			result.setData("删除失败");
			result.setMsg("失败");
			return result;
		}else
			result.setCode("1000");
			result.setData("删除成功");
			result.setMsg("成功");
			return result;
	}

	@Override
	public List<Order> getAllOrder() {
		List<Order> result=orderMapper.getAll();
		return result;
	}
		
	
	
	}
		
	
