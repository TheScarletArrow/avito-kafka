package ru.scarlet.springkafka.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(MyConsumer consumer){
//        return args -> {
//            consumer.consume(message);
//            System.out.println("Received message");
//        };
//    }
}
