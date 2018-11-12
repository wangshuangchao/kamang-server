package com.mugua.core.dynamic.pojo;

import java.io.Serializable;

public class DynamicInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dynamicId;//动态id
    private String dynamicTitle;//动态标题
    private String dynamicContent;//动态内容
    private String titleType;//标题类型
    private String contentType;//内容分类
    private String productId;//产品id
    private String cardId;//名片id
    private String extOne;//拓展字段
    private String extTwo;

    public String getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId == null ? null : dynamicId.trim();
    }

    public String getDynamicTitle() {
        return dynamicTitle;
    }

    public void setDynamicTitle(String dynamicTitle) {
        this.dynamicTitle = dynamicTitle == null ? null : dynamicTitle.trim();
    }

    public String getDynamicContent() {
        return dynamicContent;
    }

    public void setDynamicContent(String dynamicContent) {
        this.dynamicContent = dynamicContent == null ? null : dynamicContent.trim();
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType == null ? null : titleType.trim();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
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
		return "DynamicInfo [dynamicId=" + dynamicId + ", dynamicTitle=" + dynamicTitle + ", dynamicContent="
				+ dynamicContent + ", titleType=" + titleType + ", contentType=" + contentType + ", productId="
				+ productId + ", cardId=" + cardId + ", extOne=" + extOne + ", extTwo=" + extTwo + "]";
	}
    
    
}