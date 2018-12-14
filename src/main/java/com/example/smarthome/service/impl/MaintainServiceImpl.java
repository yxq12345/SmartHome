package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Maintain;
import com.example.smarthome.mapper.MaintainMapper;
import com.example.smarthome.service.MaintainService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintainServiceImpl implements MaintainService {
    @Autowired
    private MaintainMapper maintainMapper;
    @Override
    public ResultBean maintainAdd(Maintain maintain) {
        System.out.println(maintain);
        if(maintain.getBreakdown()==null||maintain.getBreakdown().equals("")||maintain.getOrderId()==null||maintain.getOrderId().equals("")||maintain.getSaddId()==null||maintain.getServertime()==null||maintain.getServertime().equals("")) {
            return ResultUtil.setError(2,"预约失败",null);
        } else {
            maintainMapper.insert(maintain);
            return ResultUtil.setOK("预约成功",null);
        }


    }
}
