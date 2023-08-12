package com.example.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @KafkaListener(topics = "order_id")
    public void doMessage(ConsumerRecord<String,String> record){
        System.out.println("已成功发送短信，订单(kafka),id: "+record.value());
    }
}
