package com.qgy.rabbitmq.seven;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

/**
 * @author qgyiimer
 * @create 2021-{07}--18:07
 * 声明主题交换机 及相关队列
 *
 * 消费者C1
 */
public class ReceiveLogsTopic01 {
    //交换机的名称
    public static final String EXCHANGE_NAME = "topic_logs";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
        String queueName = "Q1";
        channel.queueDeclare(queueName,false,false,false,null);
        channel.queueBind(queueName,EXCHANGE_NAME,"*.orange.*");
        System.out.println("等待接收消息.....");
        //接收消息
        DeliverCallback deliverCallback = (var1, var2) ->{
            System.out.println("ReceiveLogsTopic01接收到消息："+ new String(var2.getBody()));
            System.out.println("接收队列："+queueName + "绑定建："+var2.getEnvelope());
        };
        channel.basicConsume(queueName,true,deliverCallback,var ->{});
    }
}
