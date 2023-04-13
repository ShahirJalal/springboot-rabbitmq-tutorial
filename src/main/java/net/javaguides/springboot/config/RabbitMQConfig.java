package net.javaguides.springboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${rabbitmq.queue.name}")
    private String queue;

    // spring bean for rabbitmq queue
    public Queue queue(){
        return new Queue(queue);
    }
}
