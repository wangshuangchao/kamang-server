package com.mugua.qichacha.pojo;
/**
 * 首页搜索展示页
 * @author 木瓜
 *
 */
public class SearchVo {

	 private String id;//用户ID
	 private String company;//公司名称
	 private String legalPersonName;//法人姓名
	 private String registeredAssets;//注册资金
	 private String createTimes;//注册时间
	 private String Status;//企业状态
	 private String photoUrl;//LOGO
	 private String type;//属于类型 1为本地用户,2为企查查用户
	public SearchVo() {
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
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "SearchVo [id=" + id + ", company=" + company + ", legalPersonName=" + legalPersonName
				+ ", registeredAssets=" + registeredAssets + ", createTimes=" + createTimes + ", photoUrl=" + photoUrl
				+ ", type=" + type + "]";
	}
}
