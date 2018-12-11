package com.example.smarthome.controller;

import com.example.smarthome.service.CartService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    //展示购物车里的所有商品
    @GetMapping("/showCartList")
    public ResultBean getCartList() {

        return cartService.getCartList();
    }
}
