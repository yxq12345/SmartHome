package com.example.smarthome.mapper;

import com.example.smarthome.admin.UserEqu;
import org.apache.ibatis.annotations.Param;

public interface UserEquMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEqu record);

    int insertSelective(UserEqu record);

    UserEqu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEqu record);

    int updateByPrimaryKey(UserEqu record);

    int insertEqu(UserEqu userEqu);

    int deleteByUid(@Param("uid") Integer uid,@Param("eid") Integer eid);
}