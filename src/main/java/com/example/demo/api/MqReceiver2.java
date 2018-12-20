/*package com.example.demo.api;
import lombok.extern.slf4j.Slf4j;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

*//**
 * @program: sell_order
 * @description: 接收消息，即消费者
 * @author: 01
 * @create: 2018-08-21 22:24
 **//*
@Slf4j
@Component
public class MqReceiver2 {

    *//**
     * 数码供应商服务 - 接收消息
     *
     * @param message message
     *//*
	 @RabbitListener(bindings = @QueueBinding(
	            exchange = @Exchange("myOrder"),
	            key = "b",
	            value = @Queue("b")
	    ))
    public void processComputer(String message) {
        log.info("bbbb message : {}", message);
    }
    
	 
	 *//**
	     * 数码供应商服务 - 接收消息
	     *
	     * @param message message
	     *//*
	    @RabbitListener(bindings = @QueueBinding(
	            value = @Queue("hhhh"),
	            exchange = @Exchange(value="ggg"),
	            key = "hh"  // 指定路由的key
	    ))
	    public void processComputer(String message) {
	        log.info("hhh message : {}", message);
	    }
	    

	    *//**
	     * 数码供应商服务 - 接收消息
	     *
	     * @param message message
	     *//*
	    @RabbitListener(bindings = @QueueBinding(
	            value = @Queue("gggggg"),
	            exchange = @Exchange(value="ggg"),
	            key = "gg"  // 指定路由的key
	    ))
	    public void a(String message) {
	        log.info("ggggg message : {}", message);
	    }

	    @RabbitListener(bindings = @QueueBinding(
	            value = @Queue("sss"),
	            exchange = @Exchange(value="kkk",type=ExchangeTypes.TOPIC),
	            key = "qq12.*"  // 指定路由的key
	    ))
	    public void processFruit3(String message) {
	        log.info("ggg333 message : {}", message);
	    }
	    

	    @RabbitListener(bindings = @QueueBinding(
	            value = @Queue("kkk"),
	            exchange = @Exchange(value="kkk",type=ExchangeTypes.TOPIC),
	            key = "qq12.123"  // 指定路由的key
	    ))
	    public void processFruit4(String message) {
	        log.info("qqq message : {}", message);
	    }

}*/