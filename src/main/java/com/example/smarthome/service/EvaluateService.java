package com.example.smarthome.service;

import com.example.smarthome.admin.Evaluate;
import com.example.smarthome.vo.ResultBean;
public interface EvaluateService {
    ResultBean findAll(String gid);

    ResultBean evaluateList(Integer gid);
    //添加商品对应的订单信息
    ResultBean addEvaluation(Evaluate evaluate);
}
