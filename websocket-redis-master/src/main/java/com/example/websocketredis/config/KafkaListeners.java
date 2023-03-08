package com.example.websocketredis.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "likelion",
            groupId = "groupID"
    )
    void listener(String data) {
        System.out.println("Listener received:" + data + ":)");
    }
}
