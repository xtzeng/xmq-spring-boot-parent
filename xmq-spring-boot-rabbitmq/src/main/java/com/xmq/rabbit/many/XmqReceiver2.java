package com.xmq.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "xmq")
public class XmqReceiver2 {

    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 2: " + neo);
    }

}
