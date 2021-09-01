package com.example.cloud.controller;

import com.example.cloud.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Value("${server.port}")
    String port;

    @GetMapping("getUser")
    public String getUser(Integer id){
        return "port:"+port+",用户信息为：易烊千玺"+id;
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setAge(18);
        user.setName("易烊千玺@xxxx");
        return user;
    }
}

