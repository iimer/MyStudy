package com.qgy.rabbitmq.three;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

/**
 * @author qgyiimer
 * @create 2021-{07}--14:50
 * 消息在手动应答时是不丢失、放回队列中重新消费的
 */
public class Work04 {
    public static final String TASK_QUEUE_NAME = "ack_queue";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        System.out.println("C2等待接收消息处理时间长");
        DeliverCallback deliverCallback = (var1,var2) -> {
            System.out.println("接收到消息："+new String(var2.getBody()));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //应答,不批量应答
            channel.basicAck(var2.getEnvelope().getDeliveryTag(),false);
            System.out.println("消息成功应答");
        };
        CancelCallback cancelCallback = var -> {};
        //设置不公平分发
//        channel.basicQos(1);
        //预取值为5条
        channel.basicQos(5);
        channel.basicConsume(TASK_QUEUE_NAME,false,deliverCallback,cancelCallback);
    }
}
