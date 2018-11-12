package com.mugua.core.card.pojo;

import java.io.Serializable;

public class CardVo implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//用户ID
	 private String company;//公司名称
	 private String userName;//用户昵称
	 private String userPhone;//用户电话
	 private String companyVidio;//宣传视频
	 private String productUrlOne;//产品1
	 private String productUrlTwo;//产品2
	 private String microblog;//宣传视频图片
	 private String goodsPhoto1;//产品1图片
	 private String goodsPhoto2;//产品2图片
	 private String organizationCode;//组织机构代码
	 private String legalPersonName;//法人姓名
	 private String registeredAssets;//注册资金
	 private String createTimes;//注册时间
	 private String introduceCompany;//公司简介
	 private String companyAddr;//企业地址
	 private String legalPersonPhone;// 
	 private String scopeOfBusiness;//简介的一句话
	 private String photoUrl;//LOGO
	 private String Qrcode;//名片二维码
	 private Byte isCentification;//是否认证
	 private String exts;//是否生成过名片
	public CardVo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompanyVidio() {
		return companyVidio;
	}
	public void setCompanyVidio(String companyVidio) {
		this.companyVidio = companyVidio;
	}
	public String getProductUrlOne() {
		return productUrlOne;
	}
	public void setProductUrlOne(String productUrlOne) {
		this.productUrlOne = productUrlOne;
	}
	public String getProductUrlTwo() {
		return productUrlTwo;
	}
	public void setProductUrlTwo(String productUrlTwo) {
		this.productUrlTwo = productUrlTwo;
	}
	public String getMicroblog() {
		return microblog;
	}
	public void setMicroblog(String microblog) {
		this.microblog = microblog;
	}
	public String getGoodsPhoto1() {
		return goodsPhoto1;
	}
	public void setGoodsPhoto1(String goodsPhoto1) {
		this.goodsPhoto1 = goodsPhoto1;
	}
	public String getGoodsPhoto2() {
		return goodsPhoto2;
	}
	public void setGoodsPhoto2(String goodsPhoto2) {
		this.goodsPhoto2 = goodsPhoto2;
	}
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getLegalPersonName() {
		return legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	public String getRegisteredAssets() {
		return registeredAssets;
	}
	public void setRegisteredAssets(String registeredAssets) {
		this.registeredAssets = registeredAssets;
	}
	public String getCreateTimes() {
		return createTimes;
	}
	public void setCreateTimes(String createTimes) {
		this.createTimes = createTimes;
	}
	public String getIntroduceCompany() {
		return introduceCompany;
	}
	public void setIntroduceCompany(String introduceCompany) {
		this.introduceCompany = introduceCompany;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getLegalPersonPhone() {
		return legalPersonPhone;
	}
	public void setLegalPersonPhone(String legalPersonPhone) {
		this.legalPersonPhone = legalPersonPhone;
	}
	public String getScopeOfBusiness() {
		return scopeOfBusiness;
	}
	public void setScopeOfBusiness(String scopeOfBusiness) {
		this.scopeOfBusiness = scopeOfBusiness;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getQrcode() {
		return Qrcode;
	}
	public void setQrcode(String qrcode) {
		Qrcode = qrcode;
	}
	public Byte getIsCentification() {
		return isCentification;
	}
	public void setIsCentification(Byte isCentification) {
		this.isCentification = isCentification;
	}
	public String getExts() {
		return exts;
	}
	public void setExts(String exts) {
		this.exts = exts;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "CardVo [id=" + id + ", company=" + company + ", userName=" + userName + ", companyVidio=" + companyVidio
				+ ", productUrlOne=" + productUrlOne + ", productUrlTwo=" + productUrlTwo + ", microblog=" + microblog
				+ ", goodsPhoto1=" + goodsPhoto1 + ", goodsPhoto2=" + goodsPhoto2 + ", organizationCode="
				+ organizationCode + ", legalPersonName=" + legalPersonName + ", registeredAssets=" + registeredAssets
				+ ", createTimes=" + createTimes + ", introduceCompany=" + introduceCompany + ", companyAddr="
				+ companyAddr + ", legalPersonPhone=" + legalPersonPhone + ", scopeOfBusiness=" + scopeOfBusiness
				+ ", photoUrl=" + photoUrl + ", Qrcode=" + Qrcode + ", isCentification=" + isCentification + ", exts="
				+ exts + "]";
	}
	
	
}
