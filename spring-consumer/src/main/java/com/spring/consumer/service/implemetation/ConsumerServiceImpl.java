package com.spring.consumer.service.implemetation;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

import com.spring.consumer.dto.MessageQueue;
import com.spring.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService{
 
	public void action(MessageQueue message) {
		if("teste".equalsIgnoreCase(message.getText().trim())) {
			throw new AmqpRejectAndDontRequeueException("Não foi possível enviar a mensagem");
		}
		System.out.println(message.getText());
	}
	

}
