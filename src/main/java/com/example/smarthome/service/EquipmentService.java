package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;

public interface EquipmentService {
    ResultBean findAll(String cid);

    ResultBean findById(String uid);
}
