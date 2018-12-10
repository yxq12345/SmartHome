package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Classes;
import com.example.smarthome.mapper.ClassesMapper;
import com.example.smarthome.service.ClassesService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public ResultBean findAll() {
        List<Classes> list = classesMapper.selectAll();
        ResultBean rb= ResultUtil.setOK("展示所有",list);
        return rb;
    }
}
