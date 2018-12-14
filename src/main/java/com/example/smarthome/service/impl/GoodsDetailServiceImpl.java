package com.example.smarthome.service.impl;

import com.example.smarthome.admin.GoodsDetail;
import com.example.smarthome.mapper.GoodsDetailMapper;
import com.example.smarthome.service.GoodsDetailService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService {
    @Autowired
    private GoodsDetailMapper goodsDetailMapper;
    @Override
    public ResultBean findByGid(Integer gid) {
        List<GoodsDetail> goodsDetails = goodsDetailMapper.findByGid(gid);
        return ResultUtil.setOK("OK",goodsDetails);
    }
}
