package com.crazyclub.www.waterlab.controller;
import com.crazyclub.www.waterlab.model.mybatis.User;
import com.crazyclub.www.waterlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listUsers(){
        return userService.listUsers();
    }
}
