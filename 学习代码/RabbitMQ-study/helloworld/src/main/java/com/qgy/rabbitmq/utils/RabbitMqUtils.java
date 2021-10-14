package com.qgy.rabbitmq.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author qgyiimer
 * @create 2021-{07}--20:37
 */
public class RabbitMqUtils {
    public static Channel getChannel() throws Exception{
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.153.77");
        factory.setUsername("iimer");
        factory.setPassword("iimer");

        Connection connection = factory.newConnection();
        return connection.createChannel();
    }
}
