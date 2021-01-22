package com.gqchen.bean;

import org.springframework.stereotype.Component;

/**
 * @program: online
 * @description: 角色实体类
 * @author: GuiQingChen
 * @create: 2021-01-15 16:39
 **/
@Component
public class UserRole {

    private Integer roleId;
    private String userRole;

    public UserRole() {
    }

    public UserRole(Integer roleId, String userRole) {
        this.roleId = roleId;
        this.userRole = userRole;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleId=" + roleId +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
