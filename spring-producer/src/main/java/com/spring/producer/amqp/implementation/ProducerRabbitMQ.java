package com.spring.producer.amqp.implementation;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.producer.amqp.AmqpProducer;
import com.spring.producer.dto.MessageQueue;

@Component
public class ProducerRabbitMQ implements AmqpProducer<MessageQueue> {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Value("${spring.rabbitmq.request.routing-key.producer}")
	private String queue;

	@Value("${spring.rabbitmq.request.routing-key.producer}")
	private String exchange;

	@Override
	public void producer(MessageQueue message) {
		try {
			rabbitTemplate.convertAndSend(exchange, queue, message);
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}

}
