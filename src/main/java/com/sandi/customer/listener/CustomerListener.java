package com.sandi.customer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener {

    @RabbitListener(queues = "${customer.svc.queue}")
    public void getMessage(String message){
        System.out.println(message);
    }

}
