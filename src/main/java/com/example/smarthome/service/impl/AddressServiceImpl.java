package com.example.smarthome.service.impl;

import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.ShoppAddressMapper;
import com.example.smarthome.service.AddressService;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private ShoppAddressMapper shoppAddressMapper;

    //查询地址
    @Override
    public ResultBean selectAddress(int uid) {
        if (shoppAddressMapper.selectAddress(uid) != null) {
            return ResultUtil.setOK("查询成功",shoppAddressMapper.selectAddress(uid));
        } else {
        return ResultUtil.setError(SystemCon.RERROR1,"查询失败","null");
        }
    }
}
