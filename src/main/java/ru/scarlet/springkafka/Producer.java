package ru.scarlet.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static final String  TOPIC = "first";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String message){

        kafkaTemplate.send(TOPIC,message);
    }
}
