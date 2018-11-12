package com.mugua.core.pay.mggoods.pojo;

public class MgGoods {
    private String id;//产品id
    private String name;//产品名称
    private String detail;//产品描述
    private String photo1;//图片1-7
    private String photo2;
    private String photo3;
    private String photo4;
    private String photo5;
    private String photo6;
    private String photo7;
    private Double price;//价格
    private Integer num;//库存
    private Integer isShot;//是否热门
    private Integer isRecommend;//是否推荐
    private String merchant;//商家ID
    private String isCertification;//是否认证
    private String phone;//咨询电话
    private Integer isLimitid;//是否限购
    private Integer limitid;//限购个数

    
   

	

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1 == null ? null : photo1.trim();
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2 == null ? null : photo2.trim();
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3 == null ? null : photo3.trim();
    }

    public String getPhoto4() {
        return photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4 == null ? null : photo4.trim();
    }

    public String getPhoto5() {
        return photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5 == null ? null : photo5.trim();
    }

    public String getPhoto6() {
        return photo6;
    }

    public void setPhoto6(String photo6) {
        this.photo6 = photo6 == null ? null : photo6.trim();
    }

    public String getPhoto7() {
        return photo7;
    }

    public void setPhoto7(String photo7) {
        this.photo7 = photo7 == null ? null : photo7.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getIsShot() {
        return isShot;
    }

    public void setIsShot(Integer isShot) {
        this.isShot = isShot;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant == null ? null : merchant.trim();
    }

    public String getIsCertification() {
        return isCertification;
    }

    public void setIsCertification(String isCertification) {
        this.isCertification = isCertification == null ? null : isCertification.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIsLimitid() {
        return isLimitid;
    }

    public void setIsLimitid(Integer isLimitid) {
        this.isLimitid = isLimitid;
    }

    public Integer getLimitid() {
        return limitid;
    }

    public void setLimitid(Integer limitid) {
        this.limitid = limitid;
    }

	@Override
	public String toString() {
		return "MgGoods [id=" + id + ", name=" + name + ", detail=" + detail + ", photo1=" + photo1 + ", photo2="
				+ photo2 + ", photo3=" + photo3 + ", photo4=" + photo4 + ", photo5=" + photo5 + ", photo6=" + photo6
				+ ", photo7=" + photo7 + ", price=" + price + ", num=" + num + ", isShot=" + isShot + ", isRecommend="
				+ isRecommend + ", merchant=" + merchant + ", isCertification=" + isCertification + ", phone=" + phone
				+ ", isLimitid=" + isLimitid + ", limitid=" + limitid + "]";
	}
    
}