package com.example.smarthome.controller;

import com.example.smarthome.constant.SystemCon;
import com.example.smarthome.service.UserService;
import com.example.smarthome.util.OSSUtil;
import com.example.smarthome.util.ResultUtil;
import com.example.smarthome.util.Rutil;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class OSSController {

    @Autowired
    private UserService userService;

    @PostMapping("headupload.do")
    //修改头像
    public ResultBean upload(MultipartFile file,int id) throws IOException {
        OSSUtil ossUtil = new OSSUtil("oss-cn-beijing.aliyuncs.com","LTAIVx1oizHaw5Iz",
                "X1SlkDu0eYShwW41hLw20y61xVDgbC","yxq1227");
        if (file!=null){
            String path=ossUtil.fileUp(file.getOriginalFilename(),file.getBytes());
            ResultBean rb=ResultUtil.setOK("存储成功",path);
            if (rb.getMsg().equals("存储成功")){
                //String headurl= (String) rb.getData();
              return userService.updateHead(path,id);
            }else{
                return ResultUtil.setError(SystemCon.RERROR1,"失败",null);
            }
           //return ResultUtil.setOK("存储成功",path);
        }else{
            return ResultUtil.setError(SystemCon.RERROR1,"请选择上传文件",null);
        }
    }
}
