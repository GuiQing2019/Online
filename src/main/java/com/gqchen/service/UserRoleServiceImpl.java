package com.gqchen.service;

import com.gqchen.bean.UserRole;
import com.gqchen.dao.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: online
 * @description:
 * @author: GuiQingChen
 * @create: 2021-01-18 11:21
 **/
@Service
public class UserRoleServiceImpl implements IUserRoleService {

    @Autowired
    UserRoleMapper mapper;

    @Override
    public List<UserRole> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public UserRole selectOneByUserRoleId(Integer roleId) {
        return mapper.selectOneByUserRoleId(roleId);
    }

    @Override
    public UserRole selectOneByRoleName(String userRoleName) {
        return mapper.selectOneByRoleName(userRoleName);
    }

    @Override
    public int deleteOne(int roleId) {
        return mapper.deleteOne(roleId);
    }

    @Override
    public int addUserRole(String userRoleName) {
        return mapper.addUserRole(userRoleName);
    }
}
