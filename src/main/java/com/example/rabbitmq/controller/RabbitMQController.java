package com.example.rabbitmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmq.service.RabbitMQSender;

@RestController
public class RabbitMQController {

    private final RabbitMQSender rabbitMQSender;

    public RabbitMQController(RabbitMQSender rabbitMQSender) {
        this.rabbitMQSender = rabbitMQSender;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        rabbitMQSender.sendMessage(message);
        return "Message sent: " + message;
    }
}
