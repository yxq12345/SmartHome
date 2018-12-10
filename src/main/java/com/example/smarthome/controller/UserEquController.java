package com.example.smarthome.controller;

import com.example.smarthome.admin.UserEqu;
import com.example.smarthome.service.UserEquService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEquController {
    @Autowired
    private UserEquService userEquService;

    @PostMapping("addequ.do")
    //添加设备
    public ResultBean addEqu(UserEqu userEqu){
        return userEquService.addEqu(userEqu);
    }
}
