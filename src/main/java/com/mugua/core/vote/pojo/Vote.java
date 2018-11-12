package com.mugua.core.vote.pojo;

public class Vote {
    private String wechatid;

    private Integer poll;

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid == null ? null : wechatid.trim();
    }

    public Integer getPoll() {
        return poll;
    }

    public void setPoll(Integer poll) {
        this.poll = poll;
    }
}