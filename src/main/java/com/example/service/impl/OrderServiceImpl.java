package com.example.service.impl;

import com.example.service.MessageService;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MessageService messageService;

    @Override
    public void order(String id) {
        System.out.println("订单处理开始...");
        //短信消息处理
        messageService.sendMessage(id);
        System.out.println("订单处理结束...");
        System.out.println();
    }
}
