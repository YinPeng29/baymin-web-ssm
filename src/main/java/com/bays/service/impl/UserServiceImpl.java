package com.bays.service.impl;

import com.bays.dao.UserMapper;
import com.bays.model.User;
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

    public int saveUser(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    public User selectUser(User user) {
        User resUser = userMapper.selectUser(user);
        if(resUser !=null){
            return resUser;
        }
        return null;
    }

    public List<Map> findUserByName(String username) {
        List<Map> userByName = userMapper.findUserByName(username);
        return userByName;
    }

    public int updateUser(int status, String username,String uuid) {
        int updateUser = userMapper.updateStatus(status, username,uuid);
        return updateUser;
    }
}
