package com.mugua.core.sayInfo.pojo;

public class SayInfo {
    private Integer sayId;//新闻id
    private String sayPhotoUrl;//新闻图片
    private String sayProductId;//关联产品id
    private Integer visitorNum;//浏览人数
    private String sayType;//新闻类型
    private String ext;//拓展字段
    private String sayWordUrl;//新闻内容

    public Integer getSayId() {
        return sayId;
    }

    public void setSayId(Integer sayId) {
        this.sayId = sayId;
    }

    public String getSayPhotoUrl() {
        return sayPhotoUrl;
    }

    public void setSayPhotoUrl(String sayPhotoUrl) {
        this.sayPhotoUrl = sayPhotoUrl == null ? null : sayPhotoUrl.trim();
    }

    public String getSayProductId() {
        return sayProductId;
    }

    public void setSayProductId(String sayProductId) {
        this.sayProductId = sayProductId == null ? null : sayProductId.trim();
    }

    public Integer getVisitorNum() {
        return visitorNum;
    }

    public void setVisitorNum(Integer visitorNum) {
        this.visitorNum = visitorNum;
    }

    public String getSayType() {
        return sayType;
    }

    public void setSayType(String sayType) {
        this.sayType = sayType == null ? null : sayType.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getSayWordUrl() {
        return sayWordUrl;
    }

    public void setSayWordUrl(String sayWordUrl) {
        this.sayWordUrl = sayWordUrl == null ? null : sayWordUrl.trim();
    }
}