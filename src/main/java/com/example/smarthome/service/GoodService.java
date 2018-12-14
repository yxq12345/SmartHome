package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;

public interface GoodService {
    ResultBean hotGoods(Integer pageNum, Integer pageSize);

    ResultBean findByEid(Integer eid);

    ResultBean findByid(Integer id);
}
