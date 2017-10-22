package bays.controller;

import bays.model.User;
import bays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/userId")
    @ResponseBody
    public String queryUserById(User user){
        return null;
    }

    @ResponseBody
    @RequestMapping("/userName")
    public String queryUserByName(User user){
        return null;
    }
}
