package com.spring.consumer.amqp;

public interface AmqpConsumer<T> {
	
	 void Consumer(T t);
}
