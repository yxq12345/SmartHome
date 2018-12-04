package com.example.smarthome.util;

import com.example.smarthome.vo.R;

public class Rutil {
    public static R setOK(String msg){
        return new R(1,msg,null);
    }
    public static R setERROR(String msg){
        return new R(0,msg,null);
    }
    public static R setRes(int count){
        if(count>0){
            return setOK("操作成功");
        }else {
            return setERROR("操作失败");
        }
    }

}
