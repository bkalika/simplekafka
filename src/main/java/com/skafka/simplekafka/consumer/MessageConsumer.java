package com.skafka.simplekafka.consumer;

import com.skafka.simplekafka.message.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author @bkalika
 * Created on 05.09.2022 10:42 PM
 */

@Component
public class MessageConsumer {
    private Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private MessageRepository messageRepository;

    @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume(String message) {
        log.info("MESSAGE RECEIVED AT CONSUMER END -> " + message);
        messageRepository.addMessage(message);
    }
}
