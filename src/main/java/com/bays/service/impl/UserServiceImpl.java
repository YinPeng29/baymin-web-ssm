package com.bays.service.impl;

import com.bays.dao.UserMapper;
import com.bays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<Map> findAll() {
        List<Map> all = userMapper.findAll();
        return all;
    }
}
