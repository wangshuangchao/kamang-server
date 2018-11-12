package com.mugua.core.userInfo.pojo;

import java.io.Serializable;

public class UserInfoVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//用户ID
	private String userName;//用户姓名
	private String userPhone;//用户电话
	private String token;//登录token
	private String company;//公司名称
	private String photoUrl;//头像
	private String companyType;//企业类型
	private String department;//部门职位
	private String exts;//是否生成过名片
	private Byte isCentification;//是否认证
	private String join;
	public UserInfoVo() {
	}
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
	
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getExts() {
		return exts;
	}
	public void setExts(String exts) {
		this.exts = exts;
	}
	
	public Byte getIsCentification() {
		return isCentification;
	}
	public void setIsCentification(Byte isCentification) {
		this.isCentification = isCentification;
	}
	
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	
	public String getJoin() {
		return join;
	}
	public void setJoin(String join) {
		this.join = join;
	}
	@Override
	public String toString() {
		return "UserInfoVo [id=" + id + ", userName=" + userName + ", userPhone=" + userPhone + ", token=" + token
				+ ", company=" + company + ", photoUrl=" + photoUrl + ", companyType=" + companyType + ", department="
				+ department + ", exts=" + exts + ", isCentification=" + isCentification + ", join=" + join + "]";
	}
	
	
	

	
}
