package com.example.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReceiver {

    @RabbitListener(queues = "test-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
