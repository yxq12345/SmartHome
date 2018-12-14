package com.example.smarthome.mapper;

import com.example.smarthome.admin.Install;
import com.example.smarthome.admin.ShoppAddress;

import java.util.List;

public interface ShoppAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppAddress record);

    int insertSelective(ShoppAddress record);

    ShoppAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppAddress record);

    int updateByPrimaryKey(ShoppAddress record);

    //查询地址
    List<Install> selectAddress(int uid);
}