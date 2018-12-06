package com.example.smarthome.service;

import com.example.smarthome.admin.User;
import com.example.smarthome.vo.ResultBean;

public interface UserService {
    //新增
    ResultBean save(User user);
    //校验
    ResultBean checkRepeat(String name);
}
