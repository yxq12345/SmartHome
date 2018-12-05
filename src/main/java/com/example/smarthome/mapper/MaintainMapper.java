package com.example.smarthome.mapper;

import com.example.smarthome.admin.MainTain;

public interface MainTainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MainTain record);

    int insertSelective(MainTain record);

    MainTain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MainTain record);

    int updateByPrimaryKey(MainTain record);
}