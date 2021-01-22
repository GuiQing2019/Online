package com.gqchen.controller;


import com.gqchen.bean.Result;
import com.gqchen.bean.User;
import com.gqchen.service.IUserService;
import com.gqchen.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @program: online
 * @description: 实现登录, 注册, 修改密码
 * @author: GuiQingChen
 * @create: 2021-01-10 16:45
 **/


@Controller
@RequestMapping("/UserController")
public class UserController {


    @Autowired
    IUserService service;

    @PostMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        //获取前端页面账号密码
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        System.out.println("username: "+ userName + " password: " + password);

        //log.info("进入到controller层..正在跳转登录页面");
        return "suceess";
    }
    @RequestMapping("/list")
    public String list(){

        return "userInfo/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "userInfo/add";
    }

    /**
    * @Description: listJson
    * @Param: [page(显示当前页), limit(显示多少条)]
    * @return: com.gqchen.bean.Result<com.gqchen.bean.User>
    * @Author: GuiQingChen
    * @Date: 2021/1/19
     */
    @ResponseBody
    @RequestMapping("/listjson")
    public Result<User> listJson(int page,int limit){
        Result<User> result = service.findResult(page,limit);

        return result;
    }



}
