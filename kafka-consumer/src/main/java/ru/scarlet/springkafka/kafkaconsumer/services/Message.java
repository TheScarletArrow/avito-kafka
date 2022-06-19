package ru.scarlet.springkafka.kafkaconsumer.services;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Message implements Serializable {
    String type;


    @Override
    public String toString() {
        return "{" +
                wrap("type") +":" + wrap(getType())  + "\n"  +
                '}';
    }

    public String wrap(String s) {
        return "\"" + s + "\"";
    }
}

