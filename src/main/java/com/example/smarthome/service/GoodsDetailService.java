package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;


public interface GoodsDetailService {
    ResultBean findByGid(Integer gid);
}
