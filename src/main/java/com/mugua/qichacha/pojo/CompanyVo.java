package com.mugua.qichacha.pojo;

import java.util.List;

import com.mugua.core.userInfo.pojo.UserInfo;

public class CompanyVo {

	private String Status;
	private String Message;
	private String OrderNumber;
	private Paging Paging;
	private List<Company> Result;
	private List<UserInfo> user;
	

	public List<UserInfo> getUser() {
		return user;
	}

	public void setUser(List<UserInfo> user) {
		this.user = user;
	}

	public CompanyVo() {
		super();
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}

	public Paging getPaging() {
		return Paging;
	}

	public void setPaging(Paging paging) {
		Paging = paging;
	}

	public List<Company> getResult() {
		return Result;
	}

	public void setResult(List<Company> Result) {
		this.Result = Result;
	}

	@Override
	public String toString() {
		return "CompanyVo [Status=" + Status + ", Message=" + Message + ", OrderNumber=" + OrderNumber + ", Paging="
				+ Paging + ", Result=" + Result + ", user=" + user + "]";
	}



}
