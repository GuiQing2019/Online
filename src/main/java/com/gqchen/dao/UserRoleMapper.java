package com.gqchen.dao;

import com.gqchen.bean.UserRole;

import java.util.List;

/**
 * @program: online
 * @description: 角色信息接口
 * @author: GuiQingChen
 * @create: 2021-01-15 16:35
 **/
public interface UserRoleMapper {
    public List<UserRole> queryAll();


    public UserRole selectOneByUserRoleId(Integer roleId);

    public UserRole selectOneByRoleName(String userRoleName);

    public int deleteOne(int roleId);

    public int addUserRole(String userRoleName);
}
