package com.example.smarthome.service;

import com.example.smarthome.admin.Maintain;
import com.example.smarthome.vo.ResultBean;

public interface MatainService {
    //t添加维修服务
    ResultBean addMatain(Maintain maintain);

    //查询所有维修商品
    ResultBean selectAllGoods(int uid);
}
