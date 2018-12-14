package com.example.smarthome.controller;

import com.example.smarthome.admin.User;
import com.example.smarthome.service.UserService;
import com.example.smarthome.util.ResultUtil;
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
    //注册
    public ResultBean save(User user){
        System.out.println(user.toString());
        return userService.save(user);
    }

    @GetMapping("usercheck.do")
    //验证用户名是否存在
    public ResultBean checkName(String name){
        System.out.println(name);
        return userService.checkRepeat(name);
    }

    @PostMapping("userpass.do")
    //修改密码
    public ResultBean updatePass(int uid,String password){
        return userService.updatePass(uid,password);
    }

    @GetMapping("userall.do")
    //查询用户的信息
    public ResultBean userAll(Integer id){
        return userService.findAll(id);
    }

    @PostMapping("updateinte.do")
    //根据用户id修改用户的积分
    public ResultBean updateInte(Integer inte,Integer id){
        return userService.updateInte(inte,id);
    }

    @PostMapping("updateuser.do")
    //修改用户信息
    public ResultBean updateUser(User user){
        return userService.update(user);
    }

    @GetMapping("findintebyuid.do")
    //查询用户的积分
    public ResultBean findInteByUid(Integer uid){
        return userService.findInte(uid);
    }
}
