package com.mugua.core.apply.pojo;

import java.util.List;

public class ApplyVo {

	private List<Apply> list;
	private String openid;
	private String token;
	public ApplyVo() {
		super();
	}
	public List<Apply> getList() {
		return list;
	}
	public void setList(List<Apply> list) {
		this.list = list;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "ApplyVo [list=" + list + ", openid=" + openid + ", token=" + token + "]";
	}
	
	
}
