package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    //1)收集uereka上面所有活着的服务

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
