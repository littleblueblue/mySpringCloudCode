package com.example.cloud.controller;

import com.example.cloud.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "feign")
public class FeignController {

    //编译报错，可以不用管，程序启动时才会注入此bean
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("getUser")
    public String getUser(String id){
        String company = userFeignClient.getUser(id);
        System.out.println(company);
        return company;
    }
}
