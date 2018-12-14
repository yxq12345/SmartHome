package com.example.smarthome.controller;

import com.example.smarthome.service.EvaluateService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @RequestMapping("/evaluateList")
    public ResultBean evaluateList(Integer gid){
        return evaluateService.evaluateList(gid);
    }
}
