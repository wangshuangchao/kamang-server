package com.mugua.core.ask.pojo;

import java.util.Date;

public class Ask {

	private Integer id;//主键
	private String userId;//企业ID
	private String customerName;//客户名称
	private String customerPhone;//客户电话
	private Date createTime;//创建时间
	public Ask() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Ask [id=" + id + ", userId=" + userId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", createTime=" + createTime + "]";
	}
	
}
