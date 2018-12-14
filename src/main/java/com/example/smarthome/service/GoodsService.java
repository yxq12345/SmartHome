package com.example.smarthome.service;

import com.example.smarthome.vo.ResultBean;

public interface GoodsService {
    ResultBean findGoods(String eid);

    ResultBean findDesc(String eid);

    ResultBean findAsc(String eid);

    ResultBean findByPrice(String eid,String price1,String price2);
}
