package com.qgy.rabbitmq.two;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

/**
 * @author qgyiimer
 * @create 2021-{07}--20:42
 * 这是一个工作线程（相当于之前的消费者）
 */
public class Work01 {
    //队列名称

    public static final String QUEUE_NAME="hello";

    //接收消息
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        DeliverCallback deliverCallback = (var1,var2) -> {
            System.out.println("接收到的消息："+new String(var2.getBody()));
        };
        CancelCallback cancelCallback = var -> {
            System.out.println(var+"消息消费被中断");
        };
        System.out.println("C2等待接收");
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,cancelCallback);
    }
}
