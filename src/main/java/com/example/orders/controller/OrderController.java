package com.example.orders.controller;

import com.example.orders.model.Order;
import com.example.orders.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return repository.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return repository.getOrderById(id);
    }

    @PostMapping
    public String addOrder(@RequestBody Order order) {
        repository.addOrder(order);
        return "Order added";
    }

}
