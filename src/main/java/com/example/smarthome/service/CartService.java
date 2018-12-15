package com.example.smarthome.service;

import com.example.smarthome.admin.Cart;
import com.example.smarthome.vo.ResultBean;

public interface CartService {

    //展示购物车里的所有商品
    ResultBean getCartList();

    ResultBean addCart(Cart cart);
}
