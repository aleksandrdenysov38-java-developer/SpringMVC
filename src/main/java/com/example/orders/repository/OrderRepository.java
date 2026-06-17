package com.example.orders.repository;

import com.example.orders.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final List<Order> orders = new ArrayList<>();

    public Order getOrderById(Long id) {

        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }

        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

}
