package com.skafka.simplekafka.controller;

import com.skafka.simplekafka.message.repository.MessageRepository;
import com.skafka.simplekafka.sender.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author @bkalika
 * Created on 05.09.2022 10:44 PM
 */

@RestController
public class KafkaRestController {

    @Autowired
    private MessageProducer producer;

    @Autowired
    private MessageRepository messageRepository;

    // Send message to Kafka
    @GetMapping("/send")
    public String sendMsg(
            @RequestParam("msg") String message
    ) {
        producer.sendMessage(message);
        return "" + "'+message +'" + " sent successfully!";
    }

    // Read all messages
    @GetMapping("/getAll")
    public String getAllMessages() {
        return messageRepository.getAllMessages();
    }
}
