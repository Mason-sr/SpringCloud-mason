package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced//使用@LoadBalanced注解赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
// application.xml<bean id="" class="">,
// 这里使用@Bean，用注解的方式依赖注入，相当于容器中就有一个RestTemplate对象
