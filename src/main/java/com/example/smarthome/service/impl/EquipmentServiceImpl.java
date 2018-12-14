package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Equipment;
import com.example.smarthome.mapper.EquipmentMapper;
import com.example.smarthome.service.EquipmentService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public ResultBean findAll(String cid) {
        List<Equipment> list = equipmentMapper.selectAll(cid);
        ResultBean rb= ResultUtil.setOK("操作成功",list);
        return rb;
    }

    @Override
    public ResultBean findById(String uid) {
        List<Equipment> list = equipmentMapper.selectByUid(uid);
        ResultBean rb=ResultUtil.setOK("操作成功",list);
        return rb;
    }
}
