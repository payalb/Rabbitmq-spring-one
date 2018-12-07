package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues="queue1")
public class ConsumerOne {
	/*annotate our receive method with @RabbitHandler passing in the payload that has been pushed to the queue.*/
	@RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }

}
