package com.event.broker.orderservice.controller;

import com.event.broker.base.basedomains.dto.Order;
import com.event.broker.base.basedomains.dto.OrderEvent;
import com.event.broker.orderservice.kafka.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/order/v1/")
public class OrderController {
    @Autowired
    private OrderProducer orderProducer;

    @PostMapping("/add")
    public String placeOrder(@RequestBody Order order){

       // order.setOrderId(UUID.randomUUID().toString());

        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is in pending state");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully ...";
    }
}
