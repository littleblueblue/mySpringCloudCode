package com.example.cloud.service.impl;

import com.example.cloud.service.IRibbonSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RibbonSVImpl implements IRibbonSV {

    // 启动类中注入了此模板，并且开启了负载均衡功能
    @Autowired
    RestTemplate restTemplate;

    // 程序名替代服务地址，ribbon会根据服务名自动选择服务实例
    @Override
    public String getUser(String id) {
        String user = restTemplate
                .getForObject("http://provider-user/user/getUser?id=" + id, String.class);
        return user;
    }
}

