package com.bays.dao;

import com.bays.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by yinpeng on 2017/10/24.
 */
@Repository
public interface UserMapper {
    public List<Map> findAll();
}
