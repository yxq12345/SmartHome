package com.example.smarthome.controller;

import com.example.smarthome.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    /**
     * 查询所有的类别和设备
     * @return
     */
    @RequestMapping("classesAndEqui")
    public String classesAndEqui() {
        return classesService.classesAndEqui();
    }

}
