package com.mugua.core.sayone.pojo;

import java.io.Serializable;

public class SayOneInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//主键id
    private String titleOne;//主标题
    private String titleTwo;//副标题
    private String coverPhotoOneUrl;//封面图片
    private String coverPhotoTwoUrl;
    private String coverPhotoThrUrl;
    private String coverPhotoForUrl;
    private String photoType;//封面类型
    private String newType;//新闻类型
    private Integer browseNumber;//浏览人数
    private String contPhotoOneUrl;//内容图片
    private String contPhotoTwoUrl;
    private String contPhotoThrUrl;
    private String contPhotoForUrl;
    private String contTextOne;//段落1
    private String contTextTwo;
    private String contTextThr;
    private String contTextFor;
    private String extOne;//拓展字段 创建时间
    private String extTwo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitleOne() {
        return titleOne;
    }

    public void setTitleOne(String titleOne) {
        this.titleOne = titleOne == null ? null : titleOne.trim();
    }

    public String getTitleTwo() {
        return titleTwo;
    }

    public void setTitleTwo(String titleTwo) {
        this.titleTwo = titleTwo == null ? null : titleTwo.trim();
    }

    public String getCoverPhotoOneUrl() {
        return coverPhotoOneUrl;
    }

    public void setCoverPhotoOneUrl(String coverPhotoOneUrl) {
        this.coverPhotoOneUrl = coverPhotoOneUrl == null ? null : coverPhotoOneUrl.trim();
    }

    public String getCoverPhotoTwoUrl() {
        return coverPhotoTwoUrl;
    }

    public void setCoverPhotoTwoUrl(String coverPhotoTwoUrl) {
        this.coverPhotoTwoUrl = coverPhotoTwoUrl == null ? null : coverPhotoTwoUrl.trim();
    }

    public String getCoverPhotoThrUrl() {
        return coverPhotoThrUrl;
    }

    public void setCoverPhotoThrUrl(String coverPhotoThrUrl) {
        this.coverPhotoThrUrl = coverPhotoThrUrl == null ? null : coverPhotoThrUrl.trim();
    }

    public String getCoverPhotoForUrl() {
        return coverPhotoForUrl;
    }

    public void setCoverPhotoForUrl(String coverPhotoForUrl) {
        this.coverPhotoForUrl = coverPhotoForUrl == null ? null : coverPhotoForUrl.trim();
    }

    public String getPhotoType() {
        return photoType;
    }

    public void setPhotoType(String photoType) {
        this.photoType = photoType == null ? null : photoType.trim();
    }

    public String getNewType() {
        return newType;
    }

    public void setNewType(String newType) {
        this.newType = newType == null ? null : newType.trim();
    }

    public Integer getBrowseNumber() {
        return browseNumber;
    }

    public void setBrowseNumber(Integer browseNumber) {
        this.browseNumber = browseNumber;
    }

    public String getContPhotoOneUrl() {
        return contPhotoOneUrl;
    }

    public void setContPhotoOneUrl(String contPhotoOneUrl) {
        this.contPhotoOneUrl = contPhotoOneUrl == null ? null : contPhotoOneUrl.trim();
    }

    public String getContPhotoTwoUrl() {
        return contPhotoTwoUrl;
    }

    public void setContPhotoTwoUrl(String contPhotoTwoUrl) {
        this.contPhotoTwoUrl = contPhotoTwoUrl == null ? null : contPhotoTwoUrl.trim();
    }

    public String getContPhotoThrUrl() {
        return contPhotoThrUrl;
    }

    public void setContPhotoThrUrl(String contPhotoThrUrl) {
        this.contPhotoThrUrl = contPhotoThrUrl == null ? null : contPhotoThrUrl.trim();
    }

    public String getContPhotoForUrl() {
        return contPhotoForUrl;
    }

    public void setContPhotoForUrl(String contPhotoForUrl) {
        this.contPhotoForUrl = contPhotoForUrl == null ? null : contPhotoForUrl.trim();
    }

    public String getContTextOne() {
        return contTextOne;
    }

    public void setContTextOne(String contTextOne) {
        this.contTextOne = contTextOne == null ? null : contTextOne.trim();
    }

    public String getContTextTwo() {
        return contTextTwo;
    }

    public void setContTextTwo(String contTextTwo) {
        this.contTextTwo = contTextTwo == null ? null : contTextTwo.trim();
    }

    public String getContTextThr() {
        return contTextThr;
    }

    public void setContTextThr(String contTextThr) {
        this.contTextThr = contTextThr == null ? null : contTextThr.trim();
    }

    public String getContTextFor() {
        return contTextFor;
    }

    public void setContTextFor(String contTextFor) {
        this.contTextFor = contTextFor == null ? null : contTextFor.trim();
    }

    public String getExtOne() {
        return extOne;
    }

    public void setExtOne(String extOne) {
        this.extOne = extOne == null ? null : extOne.trim();
    }

    public String getExtTwo() {
        return extTwo;
    }

    public void setExtTwo(String extTwo) {
        this.extTwo = extTwo == null ? null : extTwo.trim();
    }

	@Override
	public String toString() {
		return "SayOneInfo [id=" + id + ", titleOne=" + titleOne + ", titleTwo=" + titleTwo + ", coverPhotoOneUrl="
				+ coverPhotoOneUrl + ", coverPhotoTwoUrl=" + coverPhotoTwoUrl + ", coverPhotoThrUrl=" + coverPhotoThrUrl
				+ ", coverPhotoForUrl=" + coverPhotoForUrl + ", photoType=" + photoType + ", newType=" + newType
				+ ", browseNumber=" + browseNumber + ", contPhotoOneUrl=" + contPhotoOneUrl + ", contPhotoTwoUrl="
				+ contPhotoTwoUrl + ", contPhotoThrUrl=" + contPhotoThrUrl + ", contPhotoForUrl=" + contPhotoForUrl
				+ ", contTextOne=" + contTextOne + ", contTextTwo=" + contTextTwo + ", contTextThr=" + contTextThr
				+ ", contTextFor=" + contTextFor + ", extOne=" + extOne + ", extTwo=" + extTwo + "]";
	}
    
}