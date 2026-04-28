package com.project.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-teja-topic", groupId = "my-teja-group")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}