package com.bays.service;

import com.bays.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Map> findAll();
    public int saveUser(User user);
    public User selectUser(User user);
}
