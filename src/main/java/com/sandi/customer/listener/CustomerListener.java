package com.sandi.customer.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener {

    @JmsListener(destination = "${customer.svc.queue}")
    public void getMessage(String message){
        System.out.println(message);
    }

}