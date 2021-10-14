package com.qgy.rabbitmq.six;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;

import java.util.Scanner;

/**
 * @author qgyiimer
 * @create 2021-{07}--17:09
 */
public class DirectLogs {
    public static final String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        Scanner scanner= new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            channel.basicPublish(EXCHANGE_NAME,"error",null,s.getBytes());
            System.out.println("生产者发出信息："+s);
        }
    }
}
