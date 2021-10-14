package com.qgy.rabbitmq.one;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * @author qgyiimer
 * @create 2021-{07}--14:34
 */
public class Producer {
    //队列名称
    public static final String QUEUE_NAME="hello";

    //发消息
    public static void main(String[] args) {
        //创建一个工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.153.77");
        factory.setUsername("iimer");
        factory.setPassword("iimer");
        //创建连接
        try {
            Connection connection = factory.newConnection();
            //创建信道
            Channel channel = connection.createChannel();
            /*
            生成一个队列
            1.队列名称
            2.队列里面的消息是否持久化，默认情况存储在内存
            3.改队列是否只提供一个消费者进行消费，是否进行消息共享
            4.是否自动删除，最后一个消费者断开连接后，该队列是否自动删除
            5.其他参数
             */

            //优点级队列  需要先发完 再一起消费，否则到一个消费一个
//            Map<String,Object> map = new HashMap<>();
//            map.put("x-max-priority",10);//官方0-255 允许优先级范围0-10  太大浪费CPU与内存

//            channel.queueDeclare(QUEUE_NAME,false,false,false,map);
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
            //发消息
            String msg = "hello world";
//            for (int i = 1; i < 11; i++) {
//                String message = "info"+1;
//                AMQP.BasicProperties properties = new AMQP.BasicProperties()
//                        .builder().priority(5).build();
//                if (i==5) {
//                    channel.basicPublish("",QUEUE_NAME,properties,msg.getBytes());
//                }
//            }
            /*
            发送一个消费
            1.发送到哪个交换机
            2.路由的Key值时哪个  本次是队列的名称
            3.其他参数信息
            4.发送的消息的消息体
             */
            channel.basicPublish("",QUEUE_NAME,null,msg.getBytes());
            System.out.println("消息发送完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
