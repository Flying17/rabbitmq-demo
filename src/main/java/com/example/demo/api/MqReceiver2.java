package com.example.demo.api;
import lombok.extern.slf4j.Slf4j;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: sell_order
 * @description: 接收消息，即消费者
 * @author: 01
 * @create: 2018-08-21 22:24
 **/
@Slf4j
@Component
public class MqReceiver2 {

    /**
     * 数码供应商服务 - 接收消息
     *
     * @param message message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            exchange = @Exchange(value="myOrder",type=ExchangeTypes.TOPIC),
            key = "computer"  // 指定路由的key
    ))
    public void processComputer(String message) {
        log.info("computer message : {}", message);
    }
    

    /**
     * 数码供应商服务 - 接收消息
     *
     * @param message message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("a"),
            exchange = @Exchange(value="myOrder",type=ExchangeTypes.TOPIC),
            key = "a"  // 指定路由的key
    ))
    public void a(String message) {
        log.info("aaaa message : {}", message);
    }

}