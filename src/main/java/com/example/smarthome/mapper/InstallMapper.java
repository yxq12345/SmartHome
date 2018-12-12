package com.example.smarthome.mapper;

import com.example.smarthome.admin.Install;

import java.util.List;
import java.util.Map;

public interface InstallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Install record);

    int insertSelective(Install record);

    Install selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Install record);

    int updateByPrimaryKey(Install record);

    //查询所有安装产品
    List<Install> selectAllGoods(int uid);

    //查询物流状态
    Map<Integer, Integer> selectLogistics(int id);
}