package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper//推荐使用mapper代替repository
public interface PaymentDao {
    /*
        返回值是int的原因是在配置文件中有一个属性叫 userGenerate="true",返回的值大于0则创建成功
    */
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
