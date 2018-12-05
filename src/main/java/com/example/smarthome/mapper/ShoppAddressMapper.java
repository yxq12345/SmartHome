package com.example.smarthome.mapper;

import com.example.smarthome.admin.ShoppAddress;

public interface ShoppAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppAddress record);

    int insertSelective(ShoppAddress record);

    ShoppAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppAddress record);

    int updateByPrimaryKey(ShoppAddress record);
}