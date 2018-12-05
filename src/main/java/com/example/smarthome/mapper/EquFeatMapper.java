package com.example.smarthome.mapper;

import com.example.smarthome.admin.EquFeat;

public interface EquFeatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquFeat record);

    int insertSelective(EquFeat record);

    EquFeat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EquFeat record);

    int updateByPrimaryKey(EquFeat record);
}