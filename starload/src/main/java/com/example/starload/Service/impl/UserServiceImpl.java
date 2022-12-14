package com.example.starload.Service.impl;

import com.example.starload.Domain.User;
import com.example.starload.Mapper.UserMapper;
import com.example.starload.Service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User get(int userCode) {
        return userMapper.get(userCode);
    }

    @Override
    public User get(String userIdentity) {
        return userMapper.getById(userIdentity);
    }

    @Override
    public User getid(String userEmail) {
        return userMapper.getByEmail(userEmail);
    }

    @Override
    public User register(User user) {
        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        userMapper.register(user);
        return get(user.getUserEmail());
    }
}