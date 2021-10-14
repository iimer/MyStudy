package com.qgy.rabbitmq.two;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;

import java.util.Scanner;

/**
 * @author qgyiimer
 * @create 2021-{07}--21:06
 * 生产者发送大量的消息
 */
public class Task01 {
    //队列名称
    public static final String QUEUE_NAME = "hello";

    //发送大量消息
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        //从控制台接收信息
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            channel.basicPublish("",QUEUE_NAME,null,s.getBytes());
            System.out.println("发送消息完成"+s);
        }
    }
}
