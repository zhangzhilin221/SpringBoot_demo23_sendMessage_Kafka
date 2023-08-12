package com.example.service.impl.kafka;

import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceKafkaImpl implements MessageService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入队列(kafka),id: "+id);
        //参数1:topic名称(自定义)  参数2:存入队列的消息
        kafkaTemplate.send("order_id",id);
    }
}
