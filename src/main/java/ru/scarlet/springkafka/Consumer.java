package ru.scarlet.springkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "first")
    public void consume(String message){
        System.out.println(message);
    }
}
