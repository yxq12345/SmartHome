package com.example.smarthome.controller;

import com.example.smarthome.admin.Problems;
import com.example.smarthome.service.ProblemsService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProblemsController {
    @Autowired
    private ProblemsService problemsService;

    @PostMapping("addback.do")
    public ResultBean addBack(Problems problems){
        return problemsService.addBack(problems);
    }
}
