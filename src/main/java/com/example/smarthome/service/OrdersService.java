package com.example.smarthome.service;

import com.example.smarthome.admin.Orders;
import com.example.smarthome.vo.ResultBean;

public interface OrdersService {

    //查询所有的订单信息
    ResultBean selectAllOrders(Integer userId);

    //根据商品名称查询对应的订单信息
    ResultBean selectOrders(String goodsname,Integer userId);

    //查询不同状态对应的订单信息
    ResultBean selectOrdersByState(Integer state,Integer userId);

    //购物车商品付款之后生成订单信息
    ResultBean insertOrder(Orders orders);

    //展示订单详情
    ResultBean selectOrdersById(Integer id);
}
