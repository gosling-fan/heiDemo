package com.itheima.publisher;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class RabbitMQTest {
    @Autowired
    private  RabbitTemplate rabbitTemplate;
    @Test

//    public void sentMessage(){
//        String queueName = "hello.queue";
//        String msg = "hello,hmall";
//        rabbitTemplate.convertAndSend(queueName,msg);
//    }
    public void sentMessage(){
        String exchange = "red.direct";
//        String queueName = "hello.queue";

        String msg = "hello,hmall";
        rabbitTemplate.convertAndSend(exchange,"red",msg);
    }

}