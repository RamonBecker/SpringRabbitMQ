package com.spring.consumer.service.implemetation;

import org.springframework.stereotype.Service;

import com.spring.consumer.dto.MessageQueue;
import com.spring.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService{
 
	@Override
	public void action(MessageQueue message) throws Exception{
		System.out.println(message.getText());
	}
	

}
