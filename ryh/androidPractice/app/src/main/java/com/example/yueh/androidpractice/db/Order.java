package com.example.yueh.androidpractice.db;

/**
 * Created by yueh on 2018/9/14.
 */

public class Order {
    public int id;
    public String customName;
    public int orderPrice;
    public String country;

    public Order() {
    }

    public Order(int id, String customName, int orderPrice, String country) {
        this.id = id;
        this.customName = customName;
        this.orderPrice = orderPrice;
        this.country = country;
    }
}
