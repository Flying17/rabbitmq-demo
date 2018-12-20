/*package com.example.demo.api;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

*//**
 * @program: sell_order
 * @description: 接收消息，即消费者
 * @author: 01
 * @create: 2018-08-21 22:24
 **//*
@Slf4j
//@Component
public class MqReceiver {

    *//**
     * 水果供应商服务 - 接收消息
     *
     * @param message message
     *//*

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("gggggg"),
            exchange = @Exchange(value="ggg"),
            key = "gg2"  // 指定路由的key
    ))
    public void processFruit(String message) {
        log.info("ggg222 message : {}", message);
    }
    

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("kkk"),
            exchange = @Exchange(value="kkk",type=ExchangeTypes.TOPIC),
            key = "qq1.*"  // 指定路由的key
    ))
    public void processFruit3(String message) {
        log.info("ggg333 message : {}", message);
    }
    

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("kkk"),
            exchange = @Exchange(value="kkk",type=ExchangeTypes.TOPIC),
            key = "qq.12"  // 指定路由的key
    ))
    public void processFruit4(String message) {
        log.info("qqq message : {}", message);
    }
}*/