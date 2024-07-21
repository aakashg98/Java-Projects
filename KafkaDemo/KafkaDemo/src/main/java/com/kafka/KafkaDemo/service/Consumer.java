package com.kafka.KafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "topic1", groupId = "group1")
    public void listenToTopic(String receivedMessage) {
        System.out.println("The message is received: " + receivedMessage);
    }
}
