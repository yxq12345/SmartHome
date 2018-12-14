package com.example.smarthome.controller;

import com.example.smarthome.service.EquipmentService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("findbyid.do")
    //根据类别id查询其子类
    public ResultBean findById(String cid){
        return equipmentService.findAll(cid);
    }

    @GetMapping("findbyuid.do")
    //查询用户已经添加的设备
    public ResultBean findByUid(String uid){
        return equipmentService.findById(uid);
    }

}
