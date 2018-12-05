package com.example.smarthome.mapper;

import com.example.smarthome.admin.UserEqu;

public interface UserEquMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEqu record);

    int insertSelective(UserEqu record);

    UserEqu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEqu record);

    int updateByPrimaryKey(UserEqu record);
}