package com.example.smarthome.mapper;

import com.example.smarthome.admin.Maintain;

import java.util.List;

public interface MaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Maintain record);

    int insertSelective(Maintain record);

    Maintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Maintain record);

    int updateByPrimaryKey(Maintain record);

    //查询维修商品
    List<Maintain> selectAllGoods(int uid);
}