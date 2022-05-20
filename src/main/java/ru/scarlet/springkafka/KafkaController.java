package ru.scarlet.springkafka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class KafkaController {
    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/")
    public String sendMessage(@RequestParam("message") String message){
        producer.sendMessage(message);

        return "123";
    }
}
