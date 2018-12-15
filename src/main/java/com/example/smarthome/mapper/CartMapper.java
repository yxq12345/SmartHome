package com.example.smarthome.mapper;

import com.example.smarthome.admin.Cart;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //展示购物车里的所有商品
    List<Cart> selectAllGoods();

    int insertCart(Cart cart);
}