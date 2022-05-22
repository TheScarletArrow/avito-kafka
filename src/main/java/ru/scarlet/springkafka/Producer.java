package ru.scarlet.springkafka;

import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static final String TOPIC = "first";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String topic, Message message) {

        kafkaTemplate.send(topic, message.toString());
        System.out.println("message sent Producer.class");
    }
}
