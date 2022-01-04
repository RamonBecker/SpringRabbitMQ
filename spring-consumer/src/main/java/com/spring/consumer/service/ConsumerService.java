package com.spring.consumer.service;

import com.spring.consumer.dto.MessageQueue;

public interface ConsumerService {
	
	void action(MessageQueue message);
}
