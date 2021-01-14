package com.ahui.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;

@Component("user")
public class User implements Serializable {
    private Long userID = null; //id      *
    private String userName = null; //用户名
    private String userPhone = null; //手机号
    private String userEmail = null; //邮箱      *
    private String userPassWord = null; //密码    *
    private Integer userSex = 1; //性别  1男  0女  *
    private String userAddress = null; //地址
    private Date userAge = null; //出生年月  java.sql.date
    private String userImg = null; //用户头像
    private Integer userStatus = 1; //身份 0管理员，1普通用户     *

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getUserAge() {
        return userAge;
    }

    public void setUserAge(Date userAge) {
        this.userAge = userAge;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassWord='" + userPassWord + '\'' +
                ", userSex=" + userSex +
                ", userAddress='" + userAddress + '\'' +
                ", userAge=" + userAge +
                ", userImg='" + userImg + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
