package com.mugua.core.pay.order.pojo;

import java.util.Date;

public class OrderVo {
	private long id;//订单编号
    private String goodsName;//商品名称
    private String goodsPhoto;//商品图片
    private double totalFee;//总金额
    private String userId;//用户id
    
    
	public OrderVo() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsPhoto() {
		return goodsPhoto;
	}
	public void setGoodsPhoto(String goodsPhoto) {
		this.goodsPhoto = goodsPhoto;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "OrderVo [id=" + id + ", goodsName=" + goodsName + ", goodsPhoto=" + goodsPhoto + ", totalFee="
				+ totalFee + ", userId=" + userId + "]";
	}
    
}
