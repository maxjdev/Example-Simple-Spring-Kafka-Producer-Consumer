package br.com.messaging.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void receiveMessage(String message) {
        System.out.println("Consumer message: " + message);
    }
}
