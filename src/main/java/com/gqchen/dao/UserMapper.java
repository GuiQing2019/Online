package com.gqchen.dao;

import com.gqchen.bean.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public int queryCount(Map<String,Object> map);

    public List<User> queryAllUser(Map<String,Object> map);
}
