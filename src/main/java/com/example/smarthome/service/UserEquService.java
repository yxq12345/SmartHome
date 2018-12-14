package com.example.smarthome.service;

import com.example.smarthome.admin.UserEqu;
import com.example.smarthome.vo.ResultBean;

public interface UserEquService {
    ResultBean addEqu(UserEqu userEqu);

    ResultBean delEqu(Integer uid,Integer eid);
}
