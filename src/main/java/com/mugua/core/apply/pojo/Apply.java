package com.mugua.core.apply.pojo;

public class Apply {
    private Integer id;

    private String uid;

    private String uphone;

    private String photourl;

    private String story;

    private String utime;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story == null ? null : story.trim();
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime == null ? null : utime.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

	@Override
	public String toString() {
		return "Apply [id=" + id + ", uid=" + uid + ", uphone=" + uphone + ", photourl=" + photourl + ", story=" + story
				+ ", utime=" + utime + ", num=" + num + "]";
	}
    
}