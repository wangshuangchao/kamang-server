package com.mugua.core.product.pojo;

import java.io.Serializable;
import java.util.Date;

public class ProductInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productId;//产品ID
    private String productType;//产品类别
    private String productSize;//产品型号
    private Integer productStock;//库存量
    private Date crateTime;//上传时间
    private Date exp;//生产日期
    private Date deadline;//过期时间
    private Double productPrice;//价格
    private String productTitle;//产品标题
    private String productDescription;//产品描述
    private String address;//厂家地址
    private String productPhotoUrl;//商品图片
    private String productVideoUrl;//商品视频
    private String ext;//扩展字段
    private String affiliatedCompany;//所属公司
    private String state;//发布状态
    private String productName;//产品名称

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize == null ? null : productSize.trim();
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProductPhotoUrl() {
        return productPhotoUrl;
    }

    public void setProductPhotoUrl(String productPhotoUrl) {
        this.productPhotoUrl = productPhotoUrl == null ? null : productPhotoUrl.trim();
    }

    public String getProductVideoUrl() {
        return productVideoUrl;
    }

    public void setProductVideoUrl(String productVideoUrl) {
        this.productVideoUrl = productVideoUrl == null ? null : productVideoUrl.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getAffiliatedCompany() {
        return affiliatedCompany;
    }

    public void setAffiliatedCompany(String affiliatedCompany) {
        this.affiliatedCompany = affiliatedCompany == null ? null : affiliatedCompany.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
}