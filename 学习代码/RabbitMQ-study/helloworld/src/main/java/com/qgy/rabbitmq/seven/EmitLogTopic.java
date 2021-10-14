package com.qgy.rabbitmq.seven;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qgyiimer
 * @create 2021-{07}--18:13
 */
public class EmitLogTopic {
    public static final String EXCHANGE_NAME = "topic_logs";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        Map<String,String> map = new HashMap<>();
        map.put("quick.orange.rabbit","被队列Q1Q2接收到");
        map.put("lazy.orange.elephant","被队列Q1Q2接收到\n");
        map.put("quick.orange.fox","被队列Q1接收到");
        map.put("lazy.brown.fox","被队列Q2接收到");
        map.put("lazy.pink.rabbit","虽然满足两个绑定但只被队列Q2接收一次");
        map.put("quick.brown.fox","不匹配任何绑定不会被任何队列接收到会被丢弃");
        map.put("quick.orange.male.rabbit","是四个单词不匹配任何绑定会被丢弃");
        map.put("lazy.orange.male.rabbit","是四个单词但匹配Q2");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            channel.basicPublish(EXCHANGE_NAME,key,null,value.getBytes("UTF-8"));

        }

    }
}
