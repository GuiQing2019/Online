package com;

import com.gqchen.bean.UserRole;
import com.gqchen.dao.UserRoleMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * @program: online
 * @description:
 * @author: GuiQingChen
 * @create: 2021-01-15 16:58
 **/

public class Test01 {

    @Autowired
    private UserRoleMapper dao;

    @Test
    public void Test01(){

        List<UserRole> userRoles = dao.queryAll();
        System.out.println(userRoles);
    }
}
