package com.qgy.rabbitmq.five;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;

import java.util.Scanner;

/**
 * @author qgyiimer
 * @create 2021-{07}--16:48
 *
 * 发消息给交换机
 */
public class EmitLog {
    public static final String EXCHANGE_NAME = "logs";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        channel.exchangeDeclare(EXCHANGE_NAME,"fanout");
        Scanner scanner= new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            channel.basicPublish(EXCHANGE_NAME,"",null,s.getBytes());
            System.out.println("生产者发出信息："+s);
        }
    }
}
