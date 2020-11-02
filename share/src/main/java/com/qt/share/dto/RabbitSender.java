//package com.qt.share.dto;
//
//import com.alibaba.fastjson.JSON;
//import org.springframework.amqp.rabbit.connection.CorrelationData;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.UUID;
//
///**
// * @description:
// * @author: mal
// * @date: 2020/10/27
// */
//@Service
//public class RabbitSender {
//
////    @Resource(name = "appRabbitTemplate")
//    private RabbitTemplate rabbitTemplate;
//
//    /**
//     * 用于监听Server端给我们返回的确认请求,消息到了exchange，ack 就返回true
//     */
//    private final RabbitTemplate.ConfirmCallback confirmCallback = (correlationData, ack, cause) -> {
//        System.out.println("correlationData:" + correlationData);
//        System.out.println("ack:" + ack);
//        if (ack) {
//            System.out.println("将msg-db数据更新为处理成功");
//        } else {
//            System.out.println("记录异常日志...，后续会有补偿机制(定时器)");
//        }
//    };
//
//    /**
//     * 监听对不可达的消息进行后续处理;
//     * 不可达消息：指定的路由key路由不到。
//     */
//    private final RabbitTemplate.ReturnCallback returnCallback = (message, replyCode, replyText,
//                                                                  exchange, routingKey) -> System.out.println("return exchange:" + exchange + ", routingKey:" + routingKey +
//            ", replyText:" + replyText);
//
//    /**
//     * 发送消息
//     *
//     * @param bulletin
//     */
//    public void send(Bulletin bulletin) {
//        rabbitTemplate.setConfirmCallback(confirmCallback);
//        rabbitTemplate.setReturnCallback(returnCallback);
//        CorrelationData cd = new CorrelationData();
//        // 消息唯一标识
//        cd.setId(UUID.randomUUID().toString());
////        String json = JSON.toJSONString(bulletin);
////        System.out.println(json);
//        rabbitTemplate.convertAndSend("yango.exchange.10000002", "push.app", bulletin, cd);
//    }
//}
