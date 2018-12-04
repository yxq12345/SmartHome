package com.example.smarthome.service.impl;

import com.example.smarthome.admin.User;
import com.example.smarthome.mapper.UserMapper;
import com.example.smarthome.service.UserService;
import com.example.smarthome.util.Rutil;
import com.example.smarthome.vo.R;
import com.feri.byby.common.util.EncrypUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public R addUser(User user) {
        user.setPassword(EncrypUtil.md5Pass(user.getPassword()));
        return Rutil.setRes(mapper.insertUser(user));

    }
}
