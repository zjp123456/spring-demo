package org.zjp.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjp.spring.bean.UserBean;
import org.zjp.spring.dao.UserMapper;
import org.zjp.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getUser(name,password);
    }
}
