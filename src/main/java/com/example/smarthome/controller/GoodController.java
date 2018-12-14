package com.example.smarthome.controller;

import com.example.smarthome.service.GoodService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

    @Autowired
    private GoodService goodService;

    /**
     * 查询最新的产品
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/hotgoods")
    public ResultBean hotGoods(Integer pageNum, Integer pageSize){
       return goodService.hotGoods(pageNum,pageSize);
    }

    /**
     * 根据前端传递的设备id查询对应的产品
     * @param eid
     * @return
     */
    @RequestMapping("/findbyeid")
    public ResultBean findByEid(Integer eid){
        return goodService.findByEid(eid);
    }

    /**
     * 根据传递过来的商品id查询对应的商品信息
     * @param id
     * @return
     */
    @RequestMapping("/findbyid")
    public ResultBean findByid(Integer id){
        return goodService.findByid(id);
    }
}
