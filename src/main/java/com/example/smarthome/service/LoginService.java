package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;

public interface LoginService {
    //登录
    ResultBean login(String name,String password);
    //检验是否登录
    ResultBean checkLogin(String token);
    //注销
    ResultBean loginout(String token);
}
