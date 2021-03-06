package com.example.smarthome.mapper;

import com.example.smarthome.admin.Evaluate;

import java.util.List;

public interface EvaluateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKeyWithBLOBs(Evaluate record);

    int updateByPrimaryKey(Evaluate record);

    List<Evaluate> evaluateList(Integer gid);

    List<Evaluate> selectAll(String gid);

    //添加商品对应的订单信息
    int insertEvaluate(Evaluate evaluate);
}