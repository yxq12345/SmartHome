package com.example.smarthome.controller;

import com.example.smarthome.admin.Maintain;
import com.example.smarthome.service.MaintainService;
import com.example.smarthome.service.MatainService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class MaintainController {
    @Autowired
    private MatainService matainService;

    @PostMapping("/addMaintains")
    public ResultBean addMaintain(Maintain maintain) {
        return matainService.addMatain(maintain);
    }

    @GetMapping("/selectAllGoods")
    public ResultBean selectAllGood(int uid) {
        return matainService.selectAllGoods(uid);
    }
}
