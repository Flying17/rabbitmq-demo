package com.example.demo;

import org.jboss.logging.LogMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.SendTo;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
@EnableBinding(Processor.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public String enrichLogMessage(String log) {
        return null;
    }
}

