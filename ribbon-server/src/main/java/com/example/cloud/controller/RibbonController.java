package com.example.cloud.controller;

import com.example.cloud.service.IRibbonSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ribbon其实是服务消费者
 */
@RestController
@RequestMapping(value = "ribbon")
public class RibbonController {

    @Autowired
    private IRibbonSV ribbonSV;

    @GetMapping(value = "getUser")
    public String getUser(String id){
        String user = ribbonSV.getUser(id);
        System.out.println(user);
        return user;
    }
}
