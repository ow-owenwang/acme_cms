package com.example.acme_cms.service.impl;

import com.example.acme_cms.entity.User;
import com.example.acme_cms.mapper.UserMapper;
import com.example.acme_cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
