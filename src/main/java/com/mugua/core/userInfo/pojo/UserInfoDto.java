package com.mugua.core.userInfo.pojo;

import java.util.Date;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

public class UserInfoDto {

	private String id;//用户ID
    private String userName;//用户真实姓名
    private Byte userGender;//性别
    private Integer userAge;//用户年龄
    private String userPhone;//用户电话
    private String company;//公司名称
    private String userPassword;//密码
    private String photoUrl;//头像
    private Byte isCentification;//是否认证
    private String department;//部门职位
    private String qq;//QQ号码
    private String wechat;//微信号码
    private String productUrlOne;//产品1 ID
    private String microblog;//视频图片
    private String productUrlTwo;//产品2 ID
    private String companyVidio;//宣传视频
    private String ext;//身份证背面
    private String businessLicensePhotoUrl;//营业执照
    private String legalPersonName;//法人姓名
    private String organizationCode;//组织机构代码
    private String registeredAssets;//注册资金
    private Date createTime;//注册时间
    private Date createUserTime;//用户注册时间
    private String companyType;//企业类型
    private String companyAddr;//企业地址
    private Date timeLimit;//营业期限
    private String scopeOfBusiness;//简介的一句话
    private String bookings;//登记机关
    private String exts;//是否生成过名片
    private String legalPersonId;//法人身份证号码
    private String legalPersonPhone;//名片电话号码
    private String legalPersonPhotoUrl;//法人身份证照片
    private String attendingPersonnel;//操作人
    private String introduceCompany;//公司简介
    private String join;//是否参加活动
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Byte getUserGender() {
		return userGender;
	}
	public void setUserGender(Byte userGender) {
		this.userGender = userGender;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public Byte getIsCentification() {
		return isCentification;
	}
	public void setIsCentification(Byte isCentification) {
		this.isCentification = isCentification;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getProductUrlOne() {
		return productUrlOne;
	}
	public void setProductUrlOne(String productUrlOne) {
		this.productUrlOne = productUrlOne;
	}
	public String getMicroblog() {
		return microblog;
	}
	public void setMicroblog(String microblog) {
		this.microblog = microblog;
	}
	public String getProductUrlTwo() {
		return productUrlTwo;
	}
	public void setProductUrlTwo(String productUrlTwo) {
		this.productUrlTwo = productUrlTwo;
	}
	public String getCompanyVidio() {
		return companyVidio;
	}
	public void setCompanyVidio(String companyVidio) {
		this.companyVidio = companyVidio;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getBusinessLicensePhotoUrl() {
		return businessLicensePhotoUrl;
	}
	public void setBusinessLicensePhotoUrl(String businessLicensePhotoUrl) {
		this.businessLicensePhotoUrl = businessLicensePhotoUrl;
	}
	public String getLegalPersonName() {
		return legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getRegisteredAssets() {
		return registeredAssets;
	}
	public void setRegisteredAssets(String registeredAssets) {
		this.registeredAssets = registeredAssets;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateUserTime() {
		return createUserTime;
	}
	public void setCreateUserTime(Date createUserTime) {
		this.createUserTime = createUserTime;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public Date getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(Date timeLimit) {
		this.timeLimit = timeLimit;
	}
	public String getScopeOfBusiness() {
		return scopeOfBusiness;
	}
	public void setScopeOfBusiness(String scopeOfBusiness) {
		this.scopeOfBusiness = scopeOfBusiness;
	}
	public String getBookings() {
		return bookings;
	}
	public void setBookings(String bookings) {
		this.bookings = bookings;
	}
	public String getExts() {
		return exts;
	}
	public void setExts(String exts) {
		this.exts = exts;
	}
	public String getLegalPersonId() {
		return legalPersonId;
	}
	public void setLegalPersonId(String legalPersonId) {
		this.legalPersonId = legalPersonId;
	}
	public String getLegalPersonPhone() {
		return legalPersonPhone;
	}
	public void setLegalPersonPhone(String legalPersonPhone) {
		this.legalPersonPhone = legalPersonPhone;
	}
	public String getLegalPersonPhotoUrl() {
		return legalPersonPhotoUrl;
	}
	public void setLegalPersonPhotoUrl(String legalPersonPhotoUrl) {
		this.legalPersonPhotoUrl = legalPersonPhotoUrl;
	}
	public String getAttendingPersonnel() {
		return attendingPersonnel;
	}
	public void setAttendingPersonnel(String attendingPersonnel) {
		this.attendingPersonnel = attendingPersonnel;
	}
	public String getIntroduceCompany() {
		return introduceCompany;
	}
	public void setIntroduceCompany(String introduceCompany) {
		this.introduceCompany = introduceCompany;
	}
	public String getJoin() {
		return join;
	}
	public void setJoin(String join) {
		this.join = join;
	}
	public UserInfoDto() {
		super();
	}
	@Override
	public String toString() {
		return "UserInfoDto [id=" + id + ", userName=" + userName + ", userGender=" + userGender + ", userAge="
				+ userAge + ", userPhone=" + userPhone + ", company=" + company + ", userPassword=" + userPassword
				+ ", photoUrl=" + photoUrl + ", isCentification=" + isCentification + ", department=" + department
				+ ", qq=" + qq + ", wechat=" + wechat + ", productUrlOne=" + productUrlOne + ", microblog=" + microblog
				+ ", productUrlTwo=" + productUrlTwo + ", companyVidio=" + companyVidio + ", ext=" + ext
				+ ", businessLicensePhotoUrl=" + businessLicensePhotoUrl + ", legalPersonName=" + legalPersonName
				+ ", organizationCode=" + organizationCode + ", registeredAssets=" + registeredAssets + ", createTime="
				+ createTime + ", createUserTime=" + createUserTime + ", companyType=" + companyType + ", companyAddr="
				+ companyAddr + ", timeLimit=" + timeLimit + ", scopeOfBusiness=" + scopeOfBusiness + ", bookings="
				+ bookings + ", exts=" + exts + ", legalPersonId=" + legalPersonId + ", legalPersonPhone="
				+ legalPersonPhone + ", legalPersonPhotoUrl=" + legalPersonPhotoUrl + ", attendingPersonnel="
				+ attendingPersonnel + ", introduceCompany=" + introduceCompany + ", join=" + join + "]";
	}
    
}
