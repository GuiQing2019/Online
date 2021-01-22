package com.gqchen.service;

import com.gqchen.bean.Result;
import com.gqchen.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @program: online
 * @description:
 * @author: GuiQingChen
 * @create: 2021-01-18 17:13
 **/
public interface IUserService {

    int findCount(User user);

    Result<User> findResult(int page,int pageSize);
}
