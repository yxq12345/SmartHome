package com.example.smarthome.mapper;

import com.example.smarthome.admin.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int insertUser(User user);

    User selectByName(String name);

    int updatePassword(@Param("id") int id,@Param("password") String password);
}