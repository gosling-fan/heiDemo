package com.itheima.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class RabbitMQlisener {
    @RabbitListener(bindings = @QueueBinding(value = @Queue(name = "red.queue1",durable = "true"),
    exchange = @Exchange(name = "red.direct",type = ExchangeTypes.DIRECT),
    key = {"red","blue"}))
    public void lisener(String msg){
        log.info("收到消息："+msg);
        System.out.println(msg);
    }
}
