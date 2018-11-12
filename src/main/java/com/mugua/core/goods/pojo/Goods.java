package com.mugua.core.goods.pojo;

public class Goods {

	private String id;//产品id
	private String name;//产品名称
	private String detail;//产品详情
	private String photo1;//名片展示图片
	private String photo2;//详情图片
	private String photo3;
	private String photo4;
	private String photo5;
	private String photo6;
	private String photo7;
	private Double price;//价格
	private String ext;
	private String exts;
	public Goods() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPhoto1() {
		return photo1;
	}
	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}
	public String getPhoto2() {
		return photo2;
	}
	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}
	public String getPhoto3() {
		return photo3;
	}
	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}
	public String getPhoto4() {
		return photo4;
	}
	public void setPhoto4(String photo4) {
		this.photo4 = photo4;
	}
	public String getPhoto5() {
		return photo5;
	}
	public void setPhoto5(String photo5) {
		this.photo5 = photo5;
	}
	public String getPhoto6() {
		return photo6;
	}
	public void setPhoto6(String photo6) {
		this.photo6 = photo6;
	}
	public String getPhoto7() {
		return photo7;
	}
	public void setPhoto7(String photo7) {
		this.photo7 = photo7;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getExts() {
		return exts;
	}
	public void setExts(String exts) {
		this.exts = exts;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", detail=" + detail + ", photo1=" + photo1 + ", photo2=" + photo2
				+ ", photo3=" + photo3 + ", photo4=" + photo4 + ", photo5=" + photo5 + ", photo6=" + photo6
				+ ", photo7=" + photo7 + ", price=" + price + ", ext=" + ext + ", exts=" + exts + "]";
	}
	
}
