package com.mugua.core.pay.mggoods.pojo;

import java.util.List;

public class GoodsVo {

	private List<MgGoods> list;

	public GoodsVo() {
		super();
	}

	public List<MgGoods> getList() {
		return list;
	}

	public void setList(List<MgGoods> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GoodsVo [list=" + list + "]";
	}
	
}
