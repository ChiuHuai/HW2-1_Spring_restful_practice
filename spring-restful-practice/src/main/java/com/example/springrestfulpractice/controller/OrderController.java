package com.example.springrestfulpractice.controller;

import com.example.springrestfulpractice.model.Order;
import com.example.springrestfulpractice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //http://localhost:8080/order
    @GetMapping()
    public List<Order> getAllOrders() {
        return this.orderService.getAllOrders();
    }

    //change method name getOrderById() to getOrderBySeq,
    // cause the feature's name is seq in model.Order.
    //http://localhost:8080/order/:id
    @GetMapping("/{seq}")
    public Order getOrderBySeq(@PathVariable int seq) {
        return this.orderService.getOrderBySeq(seq);
    }

    // http://localhost:8080/order
    @PostMapping()
    public Order createOrder(@RequestBody Order order) {
        return this.orderService.createOrder(order);
    }

    // http://localhost:8080/order/:id
    @PutMapping("/{seq}")
    public Order updateOrder(@PathVariable int seq, @RequestBody Order order) {
        return this.orderService.updateOrder(seq, order);
    }

    // http://localhost:8080/order/:id
    @DeleteMapping("/{seq}")
    public Order deleteOrder(@PathVariable int seq) {
        return this.orderService.deleteOrder(seq);
    }

}
