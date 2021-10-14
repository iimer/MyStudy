package com.qgy.rabbitmq.five;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

/**
 * @author qgyiimer
 * @create 2021-{07}--16:37
 *
 * 消息的接收
 */
public class ReceiveLogs01 {
    //交换机的名称
    public static final String EXCHANGE_NAME = "logs";
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        channel.exchangeDeclare(EXCHANGE_NAME,"fanout");
        //生成一个临时队列，队列名称是随机的，当消费者断开与队列的连接时 队列自动删除
        String queue = channel.queueDeclare().getQueue();
        /*
        绑定交换机和队列
        (queueName,exchangeName,routingKey)
         */
        channel.queueBind(queue,EXCHANGE_NAME,"");
        System.out.println("等待接收消息，把接收到消息打印在屏幕上");
        DeliverCallback deliverCallback = (var1,var2) ->{
            System.out.println("ReceiveLogs01接收到消息："+ new String(var2.getBody()));
        };
        channel.basicConsume(queue,true,deliverCallback,var -> {});
    }
}
