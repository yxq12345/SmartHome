package com.example.smarthome.controller;

import com.example.smarthome.service.FeatureService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatrueController {
    @Autowired
    private FeatureService featureService;

    @GetMapping("findallbycid.do")
    //根据类别查询对应的功能
    public ResultBean findByCid(String cid){
        return featureService.findAll(cid);
    }
}
