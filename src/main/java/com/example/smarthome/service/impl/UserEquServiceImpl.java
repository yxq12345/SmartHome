package com.example.smarthome.service.impl;

import com.example.smarthome.admin.UserEqu;
import com.example.smarthome.mapper.UserEquMapper;
import com.example.smarthome.service.UserEquService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import javafx.scene.control.RadioButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserEquServiceImpl implements UserEquService {

    @Autowired
    private UserEquMapper userEquMapper;
    @Override
    public ResultBean addEqu(UserEqu userEqu) {
        ResultBean rb= ResultUtil.execOp(userEquMapper.insertEqu(userEqu),"添加");
        return rb;
    }
}
