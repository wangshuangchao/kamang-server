package com.mugua.core.pay.pojo;


public class PayVo {

	private String goodsId;//商品ID
	private String goodsName;//商品名称
    private String goodsDetail;//商品描述
    private Integer goodsNum;//购买数量
    private String goodsPhoto;//商品图片
    private Double totalFee;//总金额
    private Double goodsPrice;//商品价格
    private String receiver;//收件人
    private String receiverAddress;//收件人地址
    private String receiverZipCode;//邮编
    private String receiverPhone;//收件人电话
    private String userId;//用户id
    private String userName;//用户名称
    private String sellerid;//卖家id
    private String ip;//终端ip
	public PayVo() {
		super();
	}
	
	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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
	public Double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	public Double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Double goodsPrice) {
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
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "PayVo [goodsName=" + goodsName + ", goodsDetail=" + goodsDetail + ", goodsNum=" + goodsNum
				+ ", goodsPhoto=" + goodsPhoto + ", totalFee=" + totalFee + ", goodsPrice=" + goodsPrice + ", receiver="
				+ receiver + ", receiverAddress=" + receiverAddress + ", receiverZipCode=" + receiverZipCode
				+ ", receiverPhone=" + receiverPhone + ", userId=" + userId + ", userName=" + userName + ", sellerid="
				+ sellerid + ", ip=" + ip + "]";
	}

    
}
