package com.spring.producer.service;

import com.spring.producer.dto.MessageQueue;

public interface AmqpService {
 void sendToConsumer(MessageQueue message);
}
