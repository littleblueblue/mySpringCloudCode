//package com.example.cloud.config;
//
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.context.annotation.Configuration;
//
///**
// *
// * Ribbon配置自定义【细粒度配置】
// * Ribbon可实现精确到目标服务的细粒度配置。例如A服务调用服务B，A服务调用C，可以针对B服务一套配置，针对C服务另一套配置。
// * 有两种方案：1、代码配置（配置类），2、属性配置。属性配置的优先级高于代码配置。
// *
// * 使用RibbonClient，为特定的目标服务自定义配置。
// * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
// * 可参考的示例：
// * http://spring.io/guides/gs/client-side-load-balancing/
// */
//@Configuration
//@RibbonClient(name = "provider-user", configuration = RibbonConfiguration.class)
//public class TestConfiguration {
//}