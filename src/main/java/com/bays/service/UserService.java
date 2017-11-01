package com.bays.service;

import com.bays.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Map> findAll();
    int saveUser(User user);
    User selectUser(User user);
    List<Map> findUserByName(String username);
}
