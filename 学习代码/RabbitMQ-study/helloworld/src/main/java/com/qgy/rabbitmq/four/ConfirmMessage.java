package com.qgy.rabbitmq.four;

import com.qgy.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmCallback;
import com.rabbitmq.client.MessageProperties;

import java.util.UUID;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author qgyiimer
 * @create 2021-{07}--15:38
 * 发布确认模式
 *  使用的时间  比较哪种确认方式是最好的
 *      1、单个确认模式
 *      2、批量确认
 *      3、异步确认
 */
public class ConfirmMessage {
    //批量1000
    public static final int MESSAGE_COUNT = 1000;
    public static void main(String[] args) throws Exception {
        //1、单个确认  发布1000个单独确认消息，耗时586毫秒
        //publishMessageIndividually();
        //2、批量确认  发布1000个批量确认消息，耗时129毫秒
        //publishMessageBatch();
        //3、异步批量确认  发布1000个异步确认消息，耗时48毫秒  平均10条确认一次
        //发布1000个异步确认消息，耗时64毫秒(拿到每次的msg，并并发处理其中数据)
        publishMessageAsync();
    }

    //1
    public static void publishMessageIndividually() throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        String queueName = UUID.randomUUID().toString();
        channel.queueDeclare(queueName,true,false,false,null);
        //开启发布确认
        channel.confirmSelect();
        //开始时间
        long l = System.currentTimeMillis();
        //批量发消息
        for (int i = 0; i < MESSAGE_COUNT; i++) {
            String msg = i + "";
            channel.basicPublish("",queueName,null,msg.getBytes());
            //单个消息马上进行发布确认
            boolean b = channel.waitForConfirms();
            if (b) {
                System.out.println("消息发送成功");
            }

        }
        //结束时间
        long l1 = System.currentTimeMillis();
        System.out.println("发布"+MESSAGE_COUNT+"个单独确认消息，耗时"+(l1-l)+"毫秒");
    }

    //批量确认
    public static void publishMessageBatch() throws Exception{
        Channel channel = RabbitMqUtils.getChannel();
        String queueName = UUID.randomUUID().toString();
        channel.queueDeclare(queueName,true,false,false,null);
        //开启发布确认
        channel.confirmSelect();
        //开始时间
        long l = System.currentTimeMillis();

        //批量确认消息大小
        int batchSize = 100;
        //批量发送消息 批量发布确认
        for (int i = 0; i < MESSAGE_COUNT; i++) {
            String msg = i + "";
            channel.basicPublish("",queueName,null,msg.getBytes());
            //消息发布100条时批量确认一次
            if ((i+1)%100 == 0) {
                channel.waitForConfirms();
            }

        }
        //结束时间
        long l1 = System.currentTimeMillis();
        System.out.println("发布"+MESSAGE_COUNT+"个批量确认消息，耗时"+(l1-l)+"毫秒");

    }

    //异步发布确认
    public static void publishMessageAsync() throws Exception{
        Channel channel = RabbitMqUtils.getChannel();
        String queueName = UUID.randomUUID().toString();
        channel.queueDeclare(queueName,true,false,false,null);
        //开启发布确认
        channel.confirmSelect();
        /*
        线程安全有序的一个哈希表，适用于高并发的情况下
        1.轻松的将序号与消息进行关联
        2.轻松批量删除条目 只要给到序号
        3.支持高并发（多线程）
         */
        ConcurrentSkipListMap<Long,Object> outstandingConfirms=
                new ConcurrentSkipListMap<>();
        //开始时间
        long l = System.currentTimeMillis();

        //准备消息的监听器，监听消息的成功与失败
        ConfirmCallback askCallback = (var1,var2) ->{
            if (var2) {
                //2.删除已经确认的消息
                ConcurrentNavigableMap<Long,Object> confirmed =
                        outstandingConfirms.headMap(var1);
                confirmed.clear();
            } else {
                outstandingConfirms.remove(var1);
            }
             System.out.println("确认的消息tag"+var1);
        };
        ConfirmCallback nackCallback = (var1,var2) ->{
            System.out.println("未确认的消息是："+outstandingConfirms.get(var1)+"未确认的消息tag"+var1);
        };
        channel.addConfirmListener(askCallback,nackCallback);
        //批量发送消息
        for (int i = 0; i < MESSAGE_COUNT; i++) {
            String msg = i + "我是消息";
            channel.basicPublish("",queueName,null,msg.getBytes());

            //记录下所有要发送的信息
            outstandingConfirms.put(channel.getNextPublishSeqNo(), msg);
        }
        //结束时间
        long l1 = System.currentTimeMillis();
        System.out.println("发布"+MESSAGE_COUNT+"个异步确认消息，耗时"+(l1-l)+"毫秒");
    }
}
