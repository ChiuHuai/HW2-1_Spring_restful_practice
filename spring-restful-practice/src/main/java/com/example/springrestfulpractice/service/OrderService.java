package com.example.springrestfulpractice.service;

import com.example.springrestfulpractice.model.Meal;
import com.example.springrestfulpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orderList;

    public OrderService() {
        //orderList內有三筆order
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("hamburger", 200, "Delicious"));
        mealList1.add(new Meal("fries", 100, "Nice"));
        mealList1.add(new Meal("steak", 600, "Tender"));

        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("hamburger", 200, "Delicious"));
        mealList2.add(new Meal("fries", 100, "Nice"));

        List<Meal> mealList3 = new ArrayList<>();
        mealList3.add(new Meal("hamburger", 200, "Delicious"));
        mealList3.add(new Meal("steak", 100, "Tender"));

        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1, "w1", mealList1));
        this.orderList.add(new Order(2, "w2", mealList2));
        this.orderList.add(new Order(3, "w3", mealList3));
    }

    /**
     * 取得所有orderList內容
     *
     * @return List<Order>
     */
    public List<Order> getAllOrders() {
        return this.orderList;
    }

    /**
     * 由seq取得特定order內容
     * change method name getOrderById() to getOrderBySeq,
     * cause the feature's name is seq in model.Order.
     *
     * @param seq 序號
     * @return Order
     */
    public Order getOrderBySeq(int seq) {
        for (Order o : this.orderList) {
            if (seq == o.getSeq()) {
                return o;
            }
        }
        return null;
    }

    /**
     * 建立新的一筆order
     *
     * @param order 訂單
     * @return Order 新增的訂單
     */
    public Order createOrder(Order order) {
        this.orderList.add(order);
        return order;
    }

    /**
     * 由seq取得一筆特定order來修改內容
     *
     * @param seq   序號
     * @param order 訂單
     * @return Order 修改後的訂單
     */
    public Order updateOrder(int seq, Order order) {
        for (Order o : this.orderList) {
            if (seq == o.getSeq()) {
                o.setWaiter(order.getWaiter());
                o.setMealList(order.getMealList());
                return o;
            }
        }
        return null;
    }

    /**
     * 由seq取得一筆特定order刪除
     *
     * @param seq 序號
     * @return Order 刪除掉的訂單
     */
    public Order deleteOrder(int seq) {
        for (Order o : this.orderList) {
            if (seq == o.getSeq()) {
                this.orderList.remove(o);
                return o;
            }
        }
        return null;
    }
}
