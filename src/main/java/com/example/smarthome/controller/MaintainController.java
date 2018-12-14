package com.example.smarthome.controller;

import com.example.smarthome.admin.Maintain;
import com.example.smarthome.service.MaintainService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintainController {
    @Autowired
    private MaintainService maintainService;

    /**
     * 添加新的维修服务
     * @param maintain
     * @return
     */
    @RequestMapping("/maintainadd")
    public ResultBean maintainAdd(Maintain maintain) {
        return maintainService.maintainAdd(maintain);
    }

}
