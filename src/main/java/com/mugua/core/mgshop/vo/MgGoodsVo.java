package com.mugua.core.mgshop.vo;

import java.util.List;

import com.mugua.core.pay.mggoods.pojo.MgGoods;

public class MgGoodsVo {

	private List<MgGoods> hot;
	private List<MgGoods> commend;
	public MgGoodsVo() {
		super();
	}
	public List<MgGoods> getHot() {
		return hot;
	}
	public void setHot(List<MgGoods> hot) {
		this.hot = hot;
	}
	public List<MgGoods> getCommend() {
		return commend;
	}
	public void setCommend(List<MgGoods> commend) {
		this.commend = commend;
	}
	@Override
	public String toString() {
		return "MgGoodsVo [hot=" + hot + ", commend=" + commend + "]";
	}
	
	
}
