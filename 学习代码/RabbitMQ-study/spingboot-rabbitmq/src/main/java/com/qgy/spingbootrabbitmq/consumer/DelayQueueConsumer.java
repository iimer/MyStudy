package com.qgy.spingbootrabbitmq.consumer;

import com.qgy.spingbootrabbitmq.config.DelayedQueueConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author qgyiimer
 * @create 2021-{07}--22:09
 * 消费者 基于插件的延迟消息
 */
@Component
@Slf4j
public class DelayQueueConsumer {
    //监听消息
    @RabbitListener(queues = DelayedQueueConfig.DELAYED_QUEUE_NAME)
    public void receiveDelayQueue(Message message) {
        String msg = new String(message.getBody());
        log.info("当前事件：{}，收到延迟队列的消息：{}",new Date().toString(),msg);
    }
}
