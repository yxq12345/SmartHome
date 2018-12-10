package com.example.smarthome.controller;

import com.example.smarthome.service.GoodsService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("findgoods.do")
    //根据类型查询对应商品
    public ResultBean findGoods(String eid){
        return goodsService.findGoods(eid);
    }

    @GetMapping("finddesc.do")
    //根据类型查询商品并按照价格降序
    public ResultBean findDesc(String eid){
        return goodsService.findDesc(eid);
    }

    @GetMapping("findasc.do")
    //根据类型查询商品并按照价格进行升序
    public ResultBean findAsc(String eid){
        return goodsService.findAsc(eid);
    }

    @GetMapping("findbyprice.do")
    //查询价格区间
    public ResultBean findByPrice(String eid,String price1,String price2){
        return goodsService.findByPrice(eid,price1,price2);
    }

}
