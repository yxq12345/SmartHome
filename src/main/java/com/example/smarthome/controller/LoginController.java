package com.example.smarthome.controller;

import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.service.LoginService;
import com.example.smarthome.util.StringUtil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

   @Autowired
   private LoginService service;

    @PostMapping("userlogin.do")
    public ResultBean login(String name, String password){
      String token =  SystemCon.TOKENHASH;
      if (StringUtil.checkNoEmpty(token)){
          ResultBean rb=service.login(name,password);

          if (rb.getCode()== SystemCon.ROK){
              rb.setMsg("登录成功"+"token="+rb.getMsg());

              return rb;
          }else {
              return rb;
          }
      }else {
         /* ResultBean rb = loginService.*/
          ResultBean rb = service.checkLogin(token);

         return rb;
      }

    }

    @PostMapping("userlogincheck.do")
    public ResultBean check(String token){
        //String tk = SystemCon.TOKENKEY;
        ResultBean resultBean = service.checkLogin(token);
        if (resultBean.getCode()!=SystemCon.ROK){
            return resultBean;
        }
        return resultBean;
    }

    @PostMapping("loginout.do")
    //退出登录
    public ResultBean loginOut(String token){
        return service.loginout(token);
    }

}
