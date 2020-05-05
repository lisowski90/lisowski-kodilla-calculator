package com.kodilla.good.patterns.challenges.Food;

public class OrderReceiver {

    Order order1 = new Order(1, "jajka");
    Order order2 = new Order(2, "cebula");
    Order order3 = new Order(3, "karkówka");

    public Order receive(Order order) {
        return order;
    }
}
