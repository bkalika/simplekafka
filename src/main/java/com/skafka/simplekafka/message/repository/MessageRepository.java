package com.skafka.simplekafka.message.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author @bkalika
 * Created on 05.09.2022 10:36 PM
 */

@Component
public class MessageRepository {

    private List<String> list = new ArrayList<>();

    public void addMessage(String message) {
        list.add(message);
    }

    public String getAllMessages() {
        return list.toString();
    }
}
