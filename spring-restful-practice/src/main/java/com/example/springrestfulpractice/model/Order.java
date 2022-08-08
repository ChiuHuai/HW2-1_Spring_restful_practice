package com.example.springrestfulpractice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
    private int seq; //序號
    private int totalPrice;
    //totalPrice 隨著mealList 的增加而變動，不要放在constructor
    private String waiter;//服務生
    private List<Meal> mealList; //餐點list

    public Order(int seq, String waiter, List<Meal> meals) {
        this.seq = seq;
        this.waiter = waiter;
        this.mealList = meals;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Meal meal : this.getMealList()) {
            totalPrice += meal.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;//It's weird to modified totalPrice here.
    }

}
