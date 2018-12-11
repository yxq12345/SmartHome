package com.example.smarthome.controller;

import com.example.smarthome.admin.Orders;
import com.example.smarthome.service.OrdersService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    //展示所有的订单信息
    @GetMapping("/showAllOrders")
    public ResultBean getOrdersList() {

        return ordersService.selectAllOrders();
    }

    //根据商品名称查询对应的订单信息
    @GetMapping("/selectOrders")
    public ResultBean selectOrdersList(String goodsname) {

        return ordersService.selectOrders(goodsname);
    }

    //查询不同状态对应的订单信息
    @GetMapping("/selectStateOrders")
    public ResultBean selectObligationOrders(Integer state) {

        return ordersService.selectOrdersByState(state);
    }

    //购物车商品付款之后生成订单信息
    @PostMapping("/addOrders")
    public ResultBean addOrders(Orders orders) {

        return ordersService.insertOrder(orders);
    }

    //展示订单详情
    @GetMapping("/showOrdersDetail")
    public ResultBean showOrdersDetail(Integer id) {

        return ordersService.selectOrdersById(id);
    }
}
