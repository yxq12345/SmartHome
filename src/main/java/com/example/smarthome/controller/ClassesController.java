package com.example.smarthome.controller;

import com.example.smarthome.service.ClassesService;
import com.example.smarthome.vo.ResultBean;
import javafx.scene.control.RadioButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @GetMapping("findall.do")
    //查询所有的类别
    public ResultBean find(){

        return classesService.findAll();
    }



}
