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
public class MqReceiver {

    /**
     * 水果供应商服务 - 接收消息
     *
     * @param message message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            exchange = @Exchange(value="myOrder",type=ExchangeTypes.DIRECT),
            key = "fruit"  // 指定路由的key
    ))
    public void processFruit(String message) {
        log.info("fruit message : {}", message);
    }
}