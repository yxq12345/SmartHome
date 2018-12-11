package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Orders;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.OrdersMapper;
import com.example.smarthome.service.OrdersService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    //展示所有的订单信息
    @Override
    public ResultBean selectAllOrders() {

        List<Orders> ordersList = ordersMapper.selectAllOrders();
        List<Orders> data = new ArrayList<Orders>(ordersList);

        return  ResultUtil.setOK("查询成功",ordersList);
    }

    //根据商品名称查询对应的订单信息
    @Override
    public ResultBean selectOrders(String goodsname) {

        List<Orders> orders = ordersMapper.selectOrders(goodsname);
        List<Orders> orders1 = new ArrayList<Orders>(orders);

        return ResultUtil.setOK("查询成功",orders);
    }

    //查询不同状态对应的订单信息
    @Override
    public ResultBean selectOrdersByState(Integer state) {

        List<Orders> orders = ordersMapper.selectOrdersByState(state);
        List<Orders> orders1 = new ArrayList<Orders>(orders);

        return ResultUtil.setOK("查询成功",orders);
    }

    //购物车商品付款之后生成订单信息
    @Override
    public ResultBean insertOrder(Orders orders) {

        int i = ordersMapper.insertSelective(orders);
        return i == 0 ? ResultUtil.setError(SystemCon.RERROR1,"订单生成失败",null) : ResultUtil.setOK("订单生成成功",orders);
    }

    //展示订单详情
    @Override
    public ResultBean selectOrdersById(Integer id) {

        List<Orders> ordersList = ordersMapper.showDetail(id);
        List<Orders> ordersList1 = new ArrayList<Orders>(ordersList);

        return ResultUtil.setOK("成功展示订单详情",ordersList);
    }
}
