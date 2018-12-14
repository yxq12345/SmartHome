package com.example.smarthome.service.impl;

import com.example.smarthome.admin.User;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.UserMapper;
import com.example.smarthome.service.UserService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResultBean save(User user) {
        ResultBean rb = ResultUtil.execOp(userMapper.insertUser(user),"用户注册");
        return rb;
    }

    @Override
    public ResultBean checkRepeat(String name) {
        User user = userMapper.selectByName(name);
        if (user==null){
            return ResultUtil.setOK("OK",null);
        }else {
            return ResultUtil.setError(SystemCon.RERROR1,"已存在",null);
        }

    }

    @Override
    public ResultBean updatePass(int uid, String password) {

        return ResultUtil.execOp(userMapper.updatePassword(uid,password),"重置密码");
    }

    @Override
    public ResultBean updateHead(String path, int uid) {

        return ResultUtil.execOp(userMapper.uploadhead(path,uid),"修改头像");
    }

    @Override
    public ResultBean findAll(Integer id) {
        User user=userMapper.selcectById(id);
        return ResultUtil.setOK("查询用户信息",user);
    }

    @Override
    public ResultBean updateInte(Integer inte, Integer id) {
        ResultBean rb=ResultUtil.execOp(userMapper.updateintegral(inte,id),"修改积分");
        return rb;
    }

    @Override
    public ResultBean update(User user) {
        ResultBean rb=ResultUtil.execOp(userMapper.updateByPrimaryKeySelective(user),"修改");
        return rb;
    }

    @Override
    public ResultBean findInte(Integer uid) {
        int i = userMapper.selectInteByUid(uid);
        ResultBean rb=ResultUtil.setOK("查询积分",i);
        return rb;
    }
}