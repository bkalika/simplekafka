package com.skafka.simplekafka.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * @author @bkalika
 * Created on 05.09.2022 10:38 PM
 */

@Component
public class MessageProducer {
    private Logger log = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${myapp.kafka.topic}")
    private String topic;

    public void sendMessage(String message) {
        log.info("MESSAGE SENT FROM PRODUCER END -> " + message);
        kafkaTemplate.send(topic, message);
    }
}
