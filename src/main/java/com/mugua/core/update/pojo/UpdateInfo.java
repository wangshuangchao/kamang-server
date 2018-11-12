package com.mugua.core.update.pojo;

public class UpdateInfo {

	private String id;
	private String url;//下载链接
	private String sdkVersion;//版本号
	private String updateTime;
	public UpdateInfo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSdkVersion() {
		return sdkVersion;
	}
	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "UpdateInfo [id=" + id + ", url=" + url + ", sdkVersion=" + sdkVersion + ", updateTime=" + updateTime
				+ "]";
	}
	
}
