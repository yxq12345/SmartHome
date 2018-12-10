package com.example.smarthome.mapper;

import com.example.smarthome.admin.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectGoods(String eid);

    List<Goods> desc(String eid);

    List<Goods> asc(String id);

    List<Goods> selectPrice(@Param("eid") String eid,@Param("price1") String price1, @Param("price2") String price2);
}