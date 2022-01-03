package com.spring.consumer.amqp.implementation;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.spring.consumer.amqp.AmqpConsumer;
import com.spring.consumer.dto.MessageQueue;
import com.spring.consumer.service.ConsumerService;

@Configuration
public class RabbitMQConsumer implements AmqpConsumer<MessageQueue> {

	@Autowired
	private ConsumerService service;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void Consumer(MessageQueue message) {
		try {
			service.action(message);
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}

}
