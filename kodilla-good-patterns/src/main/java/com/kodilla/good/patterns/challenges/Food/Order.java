package com.kodilla.good.patterns.challenges.Food;

public class Order {

    int orderId;
    String orderedName;

    public Order(int orderId, String orderedName) {
        this.orderId = orderId;
        this.orderedName = orderedName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderedName() {
        return orderedName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderedName='" + orderedName + '\'' +
                '}';
    }
}
