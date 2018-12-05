package com.example.smarthome.mapper;

import com.example.smarthome.admin.Install;

public interface InstallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Install record);

    int insertSelective(Install record);

    Install selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Install record);

    int updateByPrimaryKey(Install record);
}