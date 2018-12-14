package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Collect;
import com.example.smarthome.mapper.CollectMapper;
import com.example.smarthome.service.CollectService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Override
    public ResultBean findCollByUid(Integer uid) {
        List<Collect> list = collectMapper.selectCollByUid(uid);
        ResultBean rb= ResultUtil.setOK("查询用户的收藏",list);
        return rb;
    }
}
