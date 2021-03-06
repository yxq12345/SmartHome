package com.example.smarthome.mapper;

import com.example.smarthome.admin.Feature;

import java.util.List;

public interface FeatureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Feature record);

    int insertSelective(Feature record);

    Feature selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Feature record);

    int updateByPrimaryKey(Feature record);

    List<Feature> selectAll(String cid);
}