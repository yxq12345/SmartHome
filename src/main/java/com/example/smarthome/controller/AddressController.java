package com.example.smarthome.controller;

import com.example.smarthome.service.AddressService;
import com.example.smarthome.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/selectAddress")
    public ResultBean selectAddresses(int uid) {
        return addressService.selectAddress(uid);
    }
}
