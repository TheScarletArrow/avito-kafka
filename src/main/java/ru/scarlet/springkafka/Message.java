package ru.scarlet.springkafka;



public class Message {
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

    public String getType() {
        return type;
    }

    public Message(String type) {
        this.type = type;
    }

    public Message() {
    }
}
