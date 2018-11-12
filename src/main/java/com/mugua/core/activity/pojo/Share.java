package com.mugua.core.activity.pojo;

public class Share {

	private String title;
	private String url;
	private String photo;
	private String content;
	public Share() {
		super();
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Share [title=" + title + ", url=" + url + ", photo=" + photo + ", content=" + content + "]";
	}

	
	
}
