package com.example.smarthome.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.smarthome.admin.User;
import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.mapper.UserMapper;
import com.example.smarthome.redis.JedisUtil;
import com.example.smarthome.service.LoginService;
import com.example.smarthome.token.TokenUtil;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.util.StringUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultBean login(String name, String password) {
        //获取登录对象信息
        User user = userMapper.selectByName(name);
        //System.out.println(user.toString());
        //校验是否存在
        if (user!=null){
            if (Objects.equals(user.getPassword(),password)){
                //登陆成功，生成令牌
                String token = TokenUtil.createToken(JSON.toJSONString(user),user.getId());

                //System.out.println(token);
                //存储到redis.
                JedisPool jedisPool = new JedisPool("120.78.213.189",6379);
                JedisUtil jedisUtil = new JedisUtil(jedisPool,"a");

                jedisUtil.addHash(SystemCon.TOKENHASH,"token"+token,JSON.toJSONString(user));
                //返回值需要携带生成的token和对应的登录信息

                return ResultUtil.setOK(token,user);

            }
        }
        return ResultUtil.setError(SystemCon.RERROR1,"登录失败",null);
    }

    @Override
    public ResultBean checkLogin(String token) {

        JedisPool jedisPool = new JedisPool("120.78.213.189",6379);
        JedisUtil jedisUtil = new JedisUtil(jedisPool,"a");

        String value=jedisUtil.getHash(SystemCon.TOKENHASH,"token"+token);

        if (StringUtil.checkNoEmpty(value)){
            User user=JSON.parseObject(value,User.class);
            return  ResultUtil.setOK("登录有效",user);
        }else{
            return ResultUtil.setError(SystemCon.RERROR1,"登录失败,请重新登录",null);
        }

    }

    @Override
    public ResultBean loginout(String token) {
        JedisPool jedisPool = new JedisPool("120.78.213.189",6379);
        JedisUtil jedisUtil = new JedisUtil(jedisPool,"a");
        jedisUtil.delHash(SystemCon.TOKENHASH,"token:"+token);
        return ResultUtil.setOK("注销成功",null);
    }


}
