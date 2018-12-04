package com.example.smarthome.controller;

import com.example.smarthome.admin.User;
import com.example.smarthome.service.UserService;
import com.example.smarthome.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/adduser.do")
    public R save(User user){
        return service.addUser(user);
    }

}
