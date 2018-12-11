package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Cart;
import com.example.smarthome.mapper.CartMapper;
import com.example.smarthome.service.CartService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    //展示购物车里的所有商品
    @Override
    public ResultBean getCartList() {

        List<Cart> cartList = cartMapper.selectAllGoods();
        List<Cart> carts = new ArrayList<Cart>(cartList);

        return ResultUtil.setOK("查询成功",cartList);
    }
}
