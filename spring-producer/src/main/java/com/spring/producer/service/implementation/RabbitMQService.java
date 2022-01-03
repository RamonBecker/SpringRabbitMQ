package com.spring.producer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.producer.amqp.AmqpProducer;
import com.spring.producer.dto.MessageQueue;
import com.spring.producer.service.AmqpService;

@Service
public class RabbitMQService implements AmqpService {

	@Autowired
	private AmqpProducer<MessageQueue> amqp;

	@Override
	public void sendToConsumer(MessageQueue message) {
		amqp.producer(message);
	}

}
