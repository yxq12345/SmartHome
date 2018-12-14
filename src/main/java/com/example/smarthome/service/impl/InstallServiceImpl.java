package com.example.smarthome.service.impl;

import com.example.smarthome.admin.Install;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.InstallMapper;
import com.example.smarthome.service.InstallService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.R;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstallServiceImpl implements InstallService {
    @Autowired
    private InstallMapper installMapper;

    //查询所有的安装商品
    @Override
    public ResultBean selectAllGoods(int uid) {
        if (installMapper.selectAllGoods(uid) != null) {
            return ResultUtil.setOK("查询成功",installMapper.selectAllGoods(uid));
        } else {
        return ResultUtil.setError(SystemCon.RERROR1,"查询失败","null");
      }
    }

    //查询物流状态
    @Override
    public ResultBean selectLogistics(int id) {
        if (installMapper.selectLogistics(id) != null) {
            return ResultUtil.setOK("查询成功",installMapper.selectLogistics(id));
        } else {
            return ResultUtil.setError(SystemCon.RERROR1,"查询失败","null");
        }
    }

    //添加安装服务
    @Override
    public ResultBean addInstall(Install install) {
        if (installMapper.insert(install) > 0) {
            return ResultUtil.setOK("添加成功","null");
        } else {
        return ResultUtil.setError(SystemCon.RERROR1,"添加失败","null");
        }
    }
}
