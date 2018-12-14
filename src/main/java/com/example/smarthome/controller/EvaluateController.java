package com.example.smarthome.controller;

import com.example.smarthome.service.EvaluateService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.smarthome.admin.Evaluate;
import com.example.smarthome.service.EvaluateService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @RequestMapping("/evaluateList")
    public ResultBean evaluateList(Integer gid) {
        return evaluateService.evaluateList(gid);
    }
    @GetMapping("findbygid.do")
    //根据商品id查询对应的评价
    public ResultBean findByGid(String gid){
        return evaluateService.findAll(gid);
    }

    //添加订单对应的评价信息
    @PostMapping("/addEvaluation")
    public ResultBean addEvaluation(Evaluate evaluate) {

        return evaluateService.addEvaluation(evaluate);
    }
}
