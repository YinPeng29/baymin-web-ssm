package com.bays.controller;

import com.bays.model.User;
import com.bays.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("all")
    public String findAll(HttpServletRequest request,Model model){
        List<Map> all = userService.findAll();
        request.setAttribute("list",all);
        logger.info("index 运行成功..."+all.toString());
        return "index";
    }

}
