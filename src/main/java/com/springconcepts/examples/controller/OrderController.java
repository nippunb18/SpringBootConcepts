package com.springconcepts.examples.controller;


import com.springconcepts.examples.entity.Order;
import com.springconcepts.examples.service.OrderProcessingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderProcessingService orderProcessingService;

    public OrderController(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }


    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody Order order)
    {
        return  ResponseEntity.ok(orderProcessingService.placeAnOrder(order));
    }
}
