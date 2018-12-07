package com.example.smarthome.controller;

import com.example.smarthome.admin.User;
import com.example.smarthome.service.UserService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("useradd.do")
    public ResultBean save(User user){
        return userService.save(user);
    }

    @GetMapping("usercheck.do")
    public ResultBean checkName(String name){
        return userService.checkRepeat(name);
    }

    @PostMapping("userpass.do")
    public ResultBean updatePass(int uid,String password){
        return userService.updatePass(uid,password);
    }
}
