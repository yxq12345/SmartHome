package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Maintain;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.MaintainMapper;
import com.example.smarthome.service.MatainService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatainServiceImpl implements MatainService {
    @Autowired
    private MaintainMapper maintainMapper;

    //添加维修
    @Override
    public ResultBean addMatain(Maintain maintain) {
        if(maintain.getBreakdown()==null||maintain.getBreakdown().equals("")||maintain.getOrderId()==null||maintain.getOrderId().equals("")||maintain.getSaddId()==null||maintain.getServertime()==null||maintain.getServertime().equals("")) {
            return ResultUtil.setError(2,"预约失败",null);
        } else {
            maintainMapper.insert(maintain);
            return ResultUtil.setOK("预约成功",null);
        }
    }

    //查询所有维修商品
    @Override
    public ResultBean selectAllGoods(int uid) {
        if (maintainMapper.selectAllGoods(uid) != null) {
            return ResultUtil.setOK("查询成功",maintainMapper.selectAllGoods(uid));
        } else {
        return ResultUtil.setError(SystemCon.RERROR1,"查询失败","null");
        }
    }
}
