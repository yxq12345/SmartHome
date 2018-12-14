package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Evaluate;
import com.example.smarthome.mapper.EvaluateMapper;
import com.example.smarthome.service.EvaluateService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateMapper evaluateMapper;
    @Override
    public ResultBean evaluateList(Integer gid) {

        return ResultUtil.setOK("Ok",evaluateMapper.evaluateList(gid));
    }
}
