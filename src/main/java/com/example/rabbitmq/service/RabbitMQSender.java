package com.example.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    private final AmqpTemplate amqpTemplate;

    public RabbitMQSender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMessage(String message) {
        amqpTemplate.convertAndSend("test-queue", message);
    }
}
