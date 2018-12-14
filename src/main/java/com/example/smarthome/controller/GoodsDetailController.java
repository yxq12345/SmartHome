package com.example.smarthome.controller;

import com.example.smarthome.service.GoodsDetailService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsDetailController {
    @Autowired
    private GoodsDetailService goodsDetailService;

    /**
     * 根据传递过来的商品id查询其对应的所有描述
     * @param gid
     * @return
     */
    @RequestMapping("/findgoogsdetails")
    public ResultBean findByGid(Integer gid) {
        return goodsDetailService.findByGid(gid);
    }
}
