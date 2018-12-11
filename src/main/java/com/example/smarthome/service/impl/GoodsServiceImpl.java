package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Goods;
import com.example.smarthome.mapper.GoodsMapper;
import com.example.smarthome.service.GoodsService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public ResultBean findGoods(String eid) {
        List<Goods> list=goodsMapper.selectGoods(eid);
        ResultBean rb= ResultUtil.setOK("查询商品",list);
        return rb;
    }

    @Override
    public ResultBean findDesc(String eid) {
        List<Goods> list=goodsMapper.desc(eid);
        ResultBean rb=ResultUtil.setOK("价格降序",list);
        return rb;
    }

    @Override
    public ResultBean findAsc(String eid) {
        List<Goods> list=goodsMapper.asc(eid);
        ResultBean rb=ResultUtil.setOK("价格升序",list);
        return rb;
    }

    @Override
    public ResultBean findByPrice(String eid, String price1, String price2) {
        List<Goods> list=goodsMapper.selectPrice(eid,price1,price2);
        ResultBean rb=ResultUtil.setOK("查询价格区间",list);
        return rb;
    }
}
