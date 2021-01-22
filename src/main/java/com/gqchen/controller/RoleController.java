package com.gqchen.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gqchen.bean.Result;
import com.gqchen.bean.UserRole;
import com.gqchen.service.UserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.relation.Role;
import java.util.List;

/**
 * @program: online
 * @description: 角色管理
 * @author: GuiQingChen
 * @create: 2021-01-14 11:05
 **/
@Controller
@RequestMapping("/RoleController")
public class RoleController {

    Result<UserRole> roleList = null;

    @Autowired
    UserRoleServiceImpl service;


    @RequestMapping("/list")
    public String role() {

        return "/roleInfo/list";
    }

    @ResponseBody
    @RequestMapping("/listjson")
    public Result<UserRole> listJson() {

        List<UserRole> userRoles = service.queryAll();
        if (userRoles != null) {

            roleList = new Result<>(0, "查询成功", userRoles.size(), userRoles);
        } else {

            roleList = new Result<>(1, "查询失败", userRoles.size(), null);
        }
        return roleList;
    }
}
