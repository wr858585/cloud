package com.atguigu.cloud.controller;

import com.atguigu.cloud.bean.User;
import com.atguigu.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUser(@RequestParam("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/getMovie")
    public Map<String,Object> buyMovie(@RequestParam("id") Integer userId){
        Map<String,Object> map = userService.getUserAndMovie(userId);
        return map;
    }

}
