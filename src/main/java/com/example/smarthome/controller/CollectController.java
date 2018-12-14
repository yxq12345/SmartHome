package com.example.smarthome.controller;

import com.example.smarthome.service.CollectService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectController {

    @Autowired
    private CollectService collectService;

    @GetMapping("findcollbyuid.do")
    public ResultBean findCollByUid(Integer uid){
        return collectService.findCollByUid(uid);
    }
}
