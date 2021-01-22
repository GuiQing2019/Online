package com.gqchen.service;

import com.gqchen.bean.Result;
import com.gqchen.bean.User;
import com.gqchen.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: online
 * @description: 服务类
 * @author: GuiQingChen
 * @create: 2021-01-18 17:17
 **/
@Service
public class UserServiceImpl implements IUserService{

    Result<User> result=null;
    @Autowired
    UserMapper mapper;


    @Override
    public int findCount(User user) {
        Map<String, Object> parame = new HashMap<>();
        parame.put("User",user);
        return mapper.queryCount(parame);
    }

    @Override
    public Result<User> findResult(int page, int pageSize) {
        Map<String, Object> parame = new HashMap<>();
        parame.put("page",(page-1)*pageSize);
        parame.put("limit",pageSize);
        List<User> users = mapper.queryAllUser(parame);

        //获取总记录数
        int count = findCount(null);
        if (users!=null) {

            result = new Result<>(0,"查询成功!",count,users);
        }else {
            result = new Result<>(1,"查询失败!",count,users);
        }

        return result;
    }
}
