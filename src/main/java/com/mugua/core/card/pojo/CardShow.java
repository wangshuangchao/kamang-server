package com.mugua.core.card.pojo;

public class CardShow {

	private String id;//用户ID
	private String company;//公司名称
	private String userName;//用户昵称
	private String legalPersonPhone;//名片电话号码
	private String companyAddr;//企业地址
	private String scopeOfBusiness;//简介的一句话
	private String photoUrl;//LOGO
	private String QRcode;//二维码地址
	public CardShow() {
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
	public String getLegalPersonPhone() {
		return legalPersonPhone;
	}
	public void setLegalPersonPhone(String legalPersonPhone) {
		this.legalPersonPhone = legalPersonPhone;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getQRcode() {
		return QRcode;
	}
	public void setQRcode(String qRcode) {
		QRcode = qRcode;
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
	@Override
	public String toString() {
		return "CardShow [id=" + id + ", company=" + company + ", userName=" + userName + ", legalPersonPhone="
				+ legalPersonPhone + ", companyAddr=" + companyAddr + ", scopeOfBusiness=" + scopeOfBusiness
				+ ", photoUrl=" + photoUrl + ", QRcode=" + QRcode + "]";
	}
	
	
}
