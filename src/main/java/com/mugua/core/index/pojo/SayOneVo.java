package com.mugua.core.index.pojo;

public class SayOneVo {

	 private String id;//主键id
	 private String titleOne;//主标题
	 private String newType;//新闻类型
	 private String photoType;//封面类型
	 private String coverPhotoOneUrl;//封面图片
	 private String coverPhotoTwoUrl;
	 private String coverPhotoThrUrl;
	 private Integer browseNumber;//浏览人数
	 private String extOne;//拓展字段 创建时间
	public SayOneVo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitleOne() {
		return titleOne;
	}
	public void setTitleOne(String titleOne) {
		this.titleOne = titleOne;
	}
	public String getNewType() {
		return newType;
	}
	public void setNewType(String newType) {
		this.newType = newType;
	}
	public String getCoverPhotoOneUrl() {
		return coverPhotoOneUrl;
	}
	public void setCoverPhotoOneUrl(String coverPhotoOneUrl) {
		this.coverPhotoOneUrl = coverPhotoOneUrl;
	}
	public Integer getBrowseNumber() {
		return browseNumber;
	}
	public void setBrowseNumber(Integer browseNumber) {
		this.browseNumber = browseNumber;
	}
	
	public String getPhotoType() {
		return photoType;
	}
	public void setPhotoType(String photoType) {
		this.photoType = photoType;
	}
	
	public String getCoverPhotoTwoUrl() {
		return coverPhotoTwoUrl;
	}
	public void setCoverPhotoTwoUrl(String coverPhotoTwoUrl) {
		this.coverPhotoTwoUrl = coverPhotoTwoUrl;
	}
	public String getCoverPhotoThrUrl() {
		return coverPhotoThrUrl;
	}
	public void setCoverPhotoThrUrl(String coverPhotoThrUrl) {
		this.coverPhotoThrUrl = coverPhotoThrUrl;
	}
	
	public String getExtOne() {
		return extOne;
	}
	public void setExtOne(String extOne) {
		this.extOne = extOne;
	}
	@Override
	public String toString() {
		return "SayOneVo [id=" + id + ", titleOne=" + titleOne + ", newType=" + newType + ", photoType=" + photoType
				+ ", coverPhotoOneUrl=" + coverPhotoOneUrl + ", coverPhotoTwoUrl=" + coverPhotoTwoUrl
				+ ", coverPhotoThrUrl=" + coverPhotoThrUrl + ", browseNumber=" + browseNumber + "]";
	}
	
	 
}
