package com.qgy.spingbootrabbitmq.consumer;

import com.qgy.spingbootrabbitmq.config.ConfirmConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author qgyiimer
 * @create 2021-{07}--14:39
 */
@Slf4j
@Component
public class Consumer {
    @RabbitListener(queues = ConfirmConfig.CONFIRM_QUEUE_NAME)
    public void receiveConfirmMessage(Message message) {
        log.info("接收到的队列confirm.queue消息：{}",new String(message.getBody()));
    }
}
