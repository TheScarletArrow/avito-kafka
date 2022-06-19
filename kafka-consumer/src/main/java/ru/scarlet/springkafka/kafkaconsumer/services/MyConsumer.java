package ru.scarlet.springkafka.kafkaconsumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MyConsumer {

    @KafkaListener(topics = "first", groupId = "1")
    public void consume(String message){
        String whatShouldBe="""
                {"type" : "message"
                }""";
        if (message.contains("message"))
          System.out.println("done!");
        else System.out.println("Hmm"+message);
    }
}