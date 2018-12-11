package com.example.smarthome.service;

import com.example.smarthome.admin.Install;
import com.example.smarthome.vo.R;
import com.example.smarthome.vo.ResultBean;

public interface InstallService {
    //查询所有需要安装的产品
    ResultBean selectAllGoods(int uid);

    //查询物流状态
    ResultBean selectLogistics(int id);

    //添加安装服务
    ResultBean addInstall(Install install);
}
