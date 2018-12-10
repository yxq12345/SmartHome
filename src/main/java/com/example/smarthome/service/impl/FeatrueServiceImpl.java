package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Feature;
import com.example.smarthome.mapper.FeatureMapper;
import com.example.smarthome.service.FeatureService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatrueServiceImpl implements FeatureService {

    @Autowired
    private FeatureMapper featureMapper;

    @Override
    public ResultBean findAll(String cid) {
        List<Feature> list = featureMapper.selectAll(cid);
        ResultBean rb= ResultUtil.setOK("操作成功",list);
        return rb;
    }
}
