package com.example.smarthome.controller;

import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.service.LoginService;
import com.example.smarthome.util.StringUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("userlogin.do")
    public ResultBean login(String name, String password, HttpServletRequest request, HttpServletResponse response){
      String token =  SystemCon.TOKENHASH;
      if (StringUtil.checkNoEmpty(token)){
          ResultBean rb=loginService.login(name,password);
          if (rb.getCode()== SystemCon.ROK){
              rb.setMsg("登录成功");
              return rb;
          }else {
              return rb;
          }
      }else {
         /* ResultBean rb = loginService.*/
         return null;
      }

    }
}
