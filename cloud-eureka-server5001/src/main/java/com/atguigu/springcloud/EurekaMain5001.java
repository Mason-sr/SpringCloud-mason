package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//有两个组件
public class EurekaMain5001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain5001.class,args);
    }
}