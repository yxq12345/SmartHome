package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;

public interface AddressService {
    //查询地址
    ResultBean selectAddress(int uid);
}
