package com.example.smarthome.service;

import com.example.smarthome.admin.User;
import com.example.smarthome.vo.ResultBean;

public interface UserService {
    //新增
    ResultBean save(User user);
    //校验
    ResultBean checkRepeat(String name);
    //修改密码
    ResultBean updatePass(int uid,String password);
    //修改头像
    ResultBean updateHead(String path,int uid);
    //查询所有信息
    ResultBean findAll(Integer id);
    //修改积分
    ResultBean updateInte(Integer inte,Integer id);
    //修改信息
    ResultBean update(User user);
    //查询积分
    ResultBean findInte(Integer uid);

}
