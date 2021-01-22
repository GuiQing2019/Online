package com.gqchen.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: online
 * @description: 用户实体类
 * @author: GuiQingChen
 * @create: 2021-01-18 16:58
 **/
@Component
public class User {
    private int userId;
    private String userName;
    private int userAge;
    private String userSex;
    private String userMail;
    private String userPhone;
    private String userAddress;
    private String password;
    private String roleId;
    private String stateId;
    private Date registerDate;
    private int fanNum;
    private String iconUrl;

    public User() {
    }

    public User(int userId, String userName, int userAge, String userSex, String userMail, String userPhone, String userAddress, String password, String roleId, String stateId, Date registerDate, int fanNum, String iconUrl) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
        this.userMail = userMail;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.password = password;
        this.roleId = roleId;
        this.stateId = stateId;
        this.registerDate = registerDate;
        this.fanNum = fanNum;
        this.iconUrl = iconUrl;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int getFanNum() {
        return fanNum;
    }

    public void setFanNum(int fanNum) {
        this.fanNum = fanNum;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", password='" + password + '\'' +
                ", roleId='" + roleId + '\'' +
                ", stateId='" + stateId + '\'' +
                ", registerDate=" + registerDate +
                ", fanNum=" + fanNum +
                ", iconUrl='" + iconUrl + '\'' +
                '}';
    }
}
