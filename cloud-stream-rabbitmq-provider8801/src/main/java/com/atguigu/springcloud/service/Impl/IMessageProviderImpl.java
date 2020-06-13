package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.service.IMessageProvider;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

//因为这时候不是和controller绑定的而是与binder绑定的所以注解应该加上
//controller调消息中间件

@EnableBinding({Source.class})//定义消息的推送管道
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial"+serial);
        return null;
    }
}
