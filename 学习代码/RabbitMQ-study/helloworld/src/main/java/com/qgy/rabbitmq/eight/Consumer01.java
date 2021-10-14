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
public class Consumer01 {
    public static final String NORMAL_EXCHANGE= "normal_exchange";
    public static final String DEAD_EXCHANGE= "dead_exchange";

    public static final String NORMAL_QUEUE= "normal_queue";
    public static final String DEAD_QUEUE= "dead_queue";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();

        channel.exchangeDeclare(NORMAL_EXCHANGE, BuiltinExchangeType.DIRECT);
        channel.exchangeDeclare(DEAD_EXCHANGE, BuiltinExchangeType.DIRECT);

        Map<String,Object> arguments = new HashMap<>();
        //过期时间  一般在发消息处设置，灵活
//        arguments.put("x-message-ttl",10000);
        //正常队列设置死信交换机
        arguments.put("x-dead-letter-exchange",DEAD_EXCHANGE);
        //设置死信routingkey
        arguments.put("x-dead-letter-routing-key","lisi");
        //设置正常队列的长度的限制
//        arguments.put("x-max-length",6);
        channel.queueDeclare(NORMAL_QUEUE,true,false,false,arguments);
        channel.queueDeclare(DEAD_QUEUE,true,false,false,null);

        //绑定交换机和队列
        channel.queueBind(NORMAL_QUEUE,NORMAL_EXCHANGE,"zhangsan");
        channel.queueBind(DEAD_QUEUE,DEAD_EXCHANGE,"lisi");

        System.out.println("等待接收消息");
//        Thread.sleep(20000);
        DeliverCallback deliverCallback = (var1,var2)-> {
            String msg = new String(var2.getBody(),"UTF-8");
            if (msg.equals("info5")) {
                System.out.println("Consumer1！拒绝！的消息是："+msg);
                    channel.basicReject(var2.getEnvelope().getDeliveryTag(),false );

            } else {

                System.out.println("Consumer1接收的消息是："+msg);
                channel.basicAck(var2.getEnvelope().getDeliveryTag(),false);
            }
        };
        channel.basicConsume(NORMAL_QUEUE,false, deliverCallback,var -> {});
    }
}
