package com.example.smarthome.mapper;

import com.example.smarthome.admin.GoodsDetail;

import java.util.List;

public interface GoodsDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsDetail record);

    int insertSelective(GoodsDetail record);

    GoodsDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsDetail record);

    int updateByPrimaryKey(GoodsDetail record);

    List<GoodsDetail> findByGid(Integer gid);
}