package com.example.smarthome.controller;

import com.example.smarthome.admin.Install;
import com.example.smarthome.service.InstallService;
import com.example.smarthome.vo.R;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class InstallController {
    @Autowired
    private InstallService installService;

    //展示所有安装的产品
    @GetMapping("/selectInstallGoods")
    public ResultBean selectAll(int uid) {
        return installService.selectAllGoods(uid);
    }

    //查询物流状态
    @GetMapping("/selectLogistics")
    public ResultBean selectAllLogistics(int id) {
        return installService.selectLogistics(id);
    }

    //添加安装服务
    @PostMapping("/addInstalls")
    public ResultBean addIntall(Install install) {
        return installService.addInstall(install);
    }

}
