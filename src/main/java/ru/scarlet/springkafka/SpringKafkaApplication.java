package ru.scarlet.springkafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@EnableKafka
public class SpringKafkaApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringKafkaApplication.class, args);
    }
    @Bean
    public NewTopic firstTopic(){
        return new NewTopic("first", 1, (short)1);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
//        return args -> {
//            kafkaTemplate.send("first", "hello world");
//        };
//    }
}
