package com.example.smarthome.mapper;

import com.example.smarthome.admin.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    //购物车商品付款之后生成订单信息
    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    //展示所有订单的信息
    List<Orders> selectAllOrders(Integer userId);

    //根据商品名称查询对应的订单信息
    List<Orders> selectOrders(@Param("goodsname") String goodsname, @Param("userId") Integer userId);

    //查询不同状态对应的订单信息
    List<Orders> selectOrdersByState(@Param("state") Integer state,@Param("userId") Integer userId);

    //展示订单详情信息
    List<Orders> showDetail(Integer id);
}