package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Problems;
import com.example.smarthome.mapper.ProblemsMapper;
import com.example.smarthome.service.ProblemsService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblemsServiceImpl implements ProblemsService {
    @Autowired
    private ProblemsMapper problemsMapper;

    @Override
    public ResultBean addBack(Problems problems) {
        ResultBean rb= ResultUtil.execOp(problemsMapper.insertback(problems),"反馈");
        return rb;
    }
}
