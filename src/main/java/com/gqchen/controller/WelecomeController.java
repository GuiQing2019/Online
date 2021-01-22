package com.gqchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: online
 * @description: 进入登录界面
 * @author: GuiQingChen
 * @create: 2021-01-10 20:20
 **/
@RequestMapping("/")
@Controller
public class WelecomeController {

    @RequestMapping("/")
    public String welecome() {

        return "index";
    }
}
