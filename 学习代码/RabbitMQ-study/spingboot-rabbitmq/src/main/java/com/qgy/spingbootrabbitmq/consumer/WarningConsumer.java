package com.qgy.spingbootrabbitmq.consumer;

import com.qgy.spingbootrabbitmq.config.ConfirmConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author qgyiimer
 * @create 2021-{07}--15:25
 * 报警消费者
 */
@Component
@Slf4j
public class WarningConsumer {
    //接收报警消息
    @RabbitListener(queues = ConfirmConfig.WARNING_QUEUE_NAME)
    public void receiveWarningMsg(Message message){
        log.error("报警发现不可路由消息：{}",new String(message.getBody()));
    }
}
