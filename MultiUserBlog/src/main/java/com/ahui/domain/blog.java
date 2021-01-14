package com.ahui.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component("blog")
public class blog implements Serializable {
    private Long blogID = null; //id  *
    private String blogTitle = null; //标题  *
    private Date createTime = null; //创建时间  java.util.Date   *
    private Date issue_time = null; //发布时间  java.util.Date
    private String blogContent = null; //内容  *
    private String blogImg = null; //标题图片
    private Long createUser = null; //发布用户，外键  *

    public Long getBlogID() {
        return blogID;
    }

    public void setBlogID(Long blogID) {
        this.blogID = blogID;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getIssue_time() {
        return issue_time;
    }

    public void setIssue_time(Date issue_time) {
        this.issue_time = issue_time;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "blog{" +
                "blogID=" + blogID +
                ", blogTitle='" + blogTitle + '\'' +
                ", createTime=" + createTime +
                ", issue_time=" + issue_time +
                ", blogContent='" + blogContent + '\'' +
                ", blogImg='" + blogImg + '\'' +
                ", createUser=" + createUser +
                '}';
    }
}
