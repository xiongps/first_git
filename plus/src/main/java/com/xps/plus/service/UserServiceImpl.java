package com.xps.plus.service;

import com.xps.plus.dao.UserMapper;
import com.xps.plus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String uName, String pwd) {
        return userMapper.login(uName,pwd);
    }
}
