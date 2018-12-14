package com.example.smarthome.mapper;

import com.example.smarthome.admin.Problems;

public interface ProblemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problems record);

    int insertSelective(Problems record);

    Problems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problems record);

    int updateByPrimaryKeyWithBLOBs(Problems record);

    int updateByPrimaryKey(Problems record);

    int insertback(Problems problems);
}