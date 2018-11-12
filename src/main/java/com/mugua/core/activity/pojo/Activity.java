package com.mugua.core.activity.pojo;

public class Activity {

	private String id;
	private String exists;//是否存在广告
	private String title;//标题
	private String content;//内容
	private String url;//
	private String photo;//照片
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Activity() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExists() {
		return exists;
	}

	public void setExists(String exists) {
		this.exists = exists;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", exists=" + exists + ", title=" + title + ", content=" + content + ", url="
				+ url + ", photo=" + photo + "]";
	}




	
	

	
	
	
}
