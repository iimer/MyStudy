package com.qgy.rabbitmq.one;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author qgyiimer
 * @create 2021-{07}--20:20
 */
public class Consumer {
    //队列的名称
    public static final String QUEUE_NAME = "hello";
    //接收消息
    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.153.77");
        factory.setUsername("iimer");
        factory.setPassword("iimer");

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();


        DeliverCallback deliverCallback = (var1, var2) -> {
            System.out.println(new String(var2.getBody()));
        };

        CancelCallback cancelCallback = var1 -> {
            System.out.println("消息消费被中断");
        };
        /*
        消费者消费消息
        1.消费哪个队列
        2.消费成功之后是否要自动应答true代表的自动应答
        3.消费者未成功消费的回调
        4.消费者取消消费的回调
         */
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,cancelCallback);

    }
}
