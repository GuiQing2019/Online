package com.gqchen.service;

import com.gqchen.bean.UserRole;

import java.util.List;

public interface IUserRoleService {
    public List<UserRole> queryAll();

    public UserRole selectOneByUserRoleId(Integer roleId);

    public UserRole selectOneByRoleName(String userRoleName);

    public int deleteOne(int roleId);

    public int addUserRole(String userRoleName);
}
