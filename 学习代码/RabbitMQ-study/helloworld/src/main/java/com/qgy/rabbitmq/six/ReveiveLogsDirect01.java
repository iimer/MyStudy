package com.qgy.rabbitmq.six;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

/**
 * @author qgyiimer
 * @create 2021-{07}--17:04
 */
public class ReveiveLogsDirect01 {
    public static final String EXCHANGE_NAME = "direct_logs";
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();

        //声明一个交换机
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        //声明一个队列
        channel.queueDeclare("console",false,false,false,null);
        channel.queueBind("console",EXCHANGE_NAME,"info");
        DeliverCallback deliverCallback = (var1, var2) ->{
            System.out.println("ReveiveLogsDirect01接收到消息："+ new String(var2.getBody()));
        };
        channel.basicConsume("console",true,deliverCallback,var -> {});
    }
}
