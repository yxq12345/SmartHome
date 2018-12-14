package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Goods;
import com.example.smarthome.admin.GoodsType;
import com.example.smarthome.admin.Photo;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.GoodsMapper;
import com.example.smarthome.mapper.GoodsTypeMapper;
import com.example.smarthome.service.GoodService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Override
    public ResultBean hotGoods(Integer pageNum, Integer pageSize) {
        Integer pagenum= SystemCon.PAGENUM;
        Integer  pagesize=SystemCon.PAGESIZE;
        if(pageNum==null){
            pageNum=pagenum;
        }
        if(pageSize==null){
            pageSize=pagesize;
        }
        List<Goods> goods = goodsMapper.hotGoods(pageNum, pageSize);
        return ResultUtil.setOK("OK",goods);
    }

    @Override
    public ResultBean findByEid(Integer eid) {
        List<Map<String,String>> goods = goodsMapper.findByEid(eid);
        return ResultUtil.setOK("OK",goods);
    }

    @Override
    public ResultBean findByid(Integer id) {
        Goods good = goodsMapper.findById(id);
        good.setGoodsTypes(goodsTypeMapper.findgoodstypes(id));
        return ResultUtil.setOK("ok",good);
    }
}
