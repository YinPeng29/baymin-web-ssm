package com.bays.controller;

import com.alibaba.fastjson.JSONObject;
import com.bays.model.User;
import com.bays.service.UserService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

//    @ResponseBody
    @RequestMapping("all")
    public String findAll(){
        List<Map> all = userService.findAll();
//        request.setAttribute("list",all);
        logger.info("index 运行成功..."+all.toString());
        Map map = all.get(0);
        User user = new User();
        user.setAddTime((Date) map.get("add_time"));
        user.setEmail((String) map.get("email"));
        user.setUserName((String) map.get("user_name"));
        Gson gson = new Gson();
        String s = gson.toJson(user);
        return "login";
    }

    @RequestMapping(value = "/login",method= RequestMethod.POST)
    @ResponseBody
    public String login(User user,HttpServletRequest request){
        User user1 = userService.selectUser(user);
        if(user1 != null){
            return "用户验证成功";
        }
        return "用户名或者密码错误!!";
    }

    @ResponseBody
    @RequestMapping("/save")
    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    public String save(User user){
        user.setAddTime(new Date());
        user.setStatus(1);
        int i = userService.saveUser(user);
        if(i>0){
            return "ok";
        }
        return "NO";
    }

}
