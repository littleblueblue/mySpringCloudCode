package com.example.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//通过此注解，来指定调用哪个服务
@FeignClient(value = "provider-user")
//@FeignClient(name = "user", url = "http://localhost:8011/") //除此之外，还可使用url属性指定请求的URL（URL可以是完整的URL或主机名）
public interface UserFeignClient {
    /**
     * 调用provider-user服务中的/user/getUser接口
     */
    @GetMapping(value = "/user/getUser")
    String getUser(@RequestParam(value = "id") String id);
}
