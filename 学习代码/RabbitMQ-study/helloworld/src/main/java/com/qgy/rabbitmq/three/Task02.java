package com.qgy.rabbitmq.three;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;

import java.util.Scanner;

/**
 * @author qgyiimer
 * @create 2021-{07}--14:45
 *
 * 消息在手动应答时是不丢失、放回队列中重新消费的
 */
public class Task02 {
    public static final String TASK_QUEUE_NAME = "ack_queue";
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();

        channel.queueDeclare(TASK_QUEUE_NAME,true,false,false,null);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            channel.basicPublish("",TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,s.getBytes());
            System.out.println("生产者发出消息："+s);
        }
    }
}
