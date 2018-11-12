package com.mugua.core.pay.order.pojo;

import java.util.Date;

public class Order {
    private long id;//订单编号
    private String goodsName;//商品名称
    private String goodsDetail;//商品描述
    private Integer goodsNum;//购买数量
    private String goodsPhoto;//商品图片
    private double totalFee;//总金额
    private double goodsPrice;//商品价格
    private String receiver;//收件人
    private String receiverAddress;//收件人地址
    private String receiverZipCode;//邮编
    private String receiverPhone;//收件人电话
    private Date createTime;//订单创建时间
    private String paymentType;//支付类型
    private String userId;//用户id
    private String userName;//用户名称
    private String shippingCode;//物流单号
    private String shippingName;//物流名称
    private String sellerid;//卖家id
    private String payStatus;//订单状态
    private String ext;//商品ID
	public Order() {
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
	public String getGoodsDetail() {
		return goodsDetail;
	}
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
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
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverZipCode() {
		return receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getShippingCode() {
		return shippingCode;
	}
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", goodsName=" + goodsName + ", goodsDetail=" + goodsDetail + ", goodsNum="
				+ goodsNum + ", goodsPhoto=" + goodsPhoto + ", totalFee=" + totalFee + ", goodsPrice=" + goodsPrice
				+ ", receiver=" + receiver + ", receiverAddress=" + receiverAddress + ", receiverZipCode="
				+ receiverZipCode + ", receiverPhone=" + receiverPhone + ", createTime=" + createTime + ", paymentType="
				+ paymentType + ", userId=" + userId + ", userName=" + userName + ", shippingCode=" + shippingCode
				+ ", shippingName=" + shippingName + ", sellerid=" + sellerid + ", payStatus=" + payStatus + ", ext="
				+ ext + "]";
	}
    
    
}