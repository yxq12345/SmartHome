package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;

public interface LoginService {
    //登录
    ResultBean login(String name,String password);
}
