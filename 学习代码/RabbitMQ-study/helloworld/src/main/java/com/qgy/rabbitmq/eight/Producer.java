package com.qgy.rabbitmq.eight;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;

import java.nio.charset.StandardCharsets;

/**
 * @author qgyiimer
 * @create 2021-{07}--14:53
 *
 * 死信队列 之生产者代码
 */
public class Producer {

    public static final String NORMAL_EXCHANGE = "normal_exchange";
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        //死信消息 设置TTL事件
//        AMQP.BasicProperties properties =
//                new AMQP.BasicProperties().builder().expiration("10000").build();

        for (int i = 0; i < 11; i++) {
            String message = "info" +i;
            channel.basicPublish(NORMAL_EXCHANGE,"zhangsan",null,message.getBytes(StandardCharsets.UTF_8));
        }
    }
}
