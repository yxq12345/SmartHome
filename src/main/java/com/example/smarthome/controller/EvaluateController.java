package com.example.smarthome.controller;

import com.example.smarthome.service.EvaluateService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @GetMapping("findbygid.do")
    //根据商品id查询对应的评价
    public ResultBean findByGid(String gid){
        return evaluateService.findAll(gid);
    }
}
