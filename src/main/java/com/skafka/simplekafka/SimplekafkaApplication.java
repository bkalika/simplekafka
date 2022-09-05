package com.skafka.simplekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SimplekafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplekafkaApplication.class, args);
	}

}
