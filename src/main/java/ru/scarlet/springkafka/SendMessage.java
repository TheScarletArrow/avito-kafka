package ru.scarlet.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/")
public class SendMessage {
    @Autowired
    Producer producer;

    @PostMapping("/")
    public void senddMessage(@RequestBody Message message){
        if(!Objects.equals(message.getType(), "message") || !Objects.equals(message.getType(), "error"))
        {  producer.sendMessage("first", message);
          System.out.println("message sent");
        }
        else {
            System.out.println("message not sent");
            producer.sendMessage("second", message);
        }
    }
}
