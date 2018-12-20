/*package com.example.demo.api;


import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send() {
        String msg = "hello rabbitmq:"+new Date();
        System.out.println("Sender:"+msg);
        //this.rabbitTemplate.convertAndSend("hello", msg);
        rabbitTemplate.convertAndSend("pikachu_e","a","send content :"+msg+"111");
        rabbitTemplate.convertAndSend("pikachu_e","b","send content :"+msg+"222");
    }
}*/