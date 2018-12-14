package com.example.smarthome.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.ClassesMapper;
import com.example.smarthome.redis.JedisUtil;
import com.example.smarthome.service.ClassesService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public String classesAndEqui() {
        JedisUtil jedisUtil = new JedisUtil("120.78.213.189",6379,"a");

        if(jedisUtil.isKey(SystemCon.CLASSESANDEQUI)) {

            return jedisUtil.getStr((SystemCon.CLASSESANDEQUI));

        } else {
            ResultBean resultBean = ResultUtil.setOK("OK",classesMapper.classesAndEqui());
            String json = JSON.toJSONString(resultBean);
            jedisUtil.addStr(SystemCon.CLASSESANDEQUI,json);
            return json;
        }

    }
}
