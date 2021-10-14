package com.qgy.rabbitmq.eight;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qgyiimer
 * @create 2021-{07}--14:20
 *
 * 死信队列 实战
 */
public class Consumer02 {
    public static final String NORMAL_EXCHANGE= "normal_exchange";
    public static final String DEAD_EXCHANGE= "dead_exchange";

    public static final String NORMAL_QUEUE= "normal_queue";
    public static final String DEAD_QUEUE= "dead_queue";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();

        System.out.println("等待接收消息");

        DeliverCallback deliverCallback = (var1,var2)-> {
            System.out.println("Consumer2接收的消息是："+new String(var2.getBody(),"UTF-8"));
        };
        channel.basicConsume(DEAD_QUEUE,true, deliverCallback,var -> {});
    }
}
