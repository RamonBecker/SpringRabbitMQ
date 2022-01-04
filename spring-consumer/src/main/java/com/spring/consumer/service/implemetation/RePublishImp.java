package com.spring.consumer.service.implemetation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.consumer.amqp.AmqpRePublish;
import com.spring.consumer.service.RePublishService;

@Service
public class RePublishImp implements RePublishService {

	@Autowired
	private AmqpRePublish rePublish;
	
	@Override
	public void rePost() {
		rePublish.rePublish();
	}

}
