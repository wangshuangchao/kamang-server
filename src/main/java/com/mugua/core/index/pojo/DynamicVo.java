package com.mugua.core.index.pojo;

public class DynamicVo {

	private String dynamicId;//动态id
    private String dynamicTitle;//类型为企业入驻,产品动态
    private String dynamicContent;//动态内容
    private String productId;//产品id
    private String cardId;//名片id
	public DynamicVo() {
		super();
	}
	public String getDynamicId() {
		return dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}
	public String getDynamicTitle() {
		return dynamicTitle;
	}
	public void setDynamicTitle(String dynamicTitle) {
		this.dynamicTitle = dynamicTitle;
	}
	public String getDynamicContent() {
		return dynamicContent;
	}
	public void setDynamicContent(String dynamicContent) {
		this.dynamicContent = dynamicContent;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	@Override
	public String toString() {
		return "DynamicVo [dynamicId=" + dynamicId + ", dynamicTitle=" + dynamicTitle + ", dynamicContent="
				+ dynamicContent + ", productId=" + productId + ", cardId=" + cardId + "]";
	}
    
}
