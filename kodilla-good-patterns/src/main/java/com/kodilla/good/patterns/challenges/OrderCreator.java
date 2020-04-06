package com.kodilla.good.patterns.challenges;

public class OrderCreator implements OrdersDatabase {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    boolean orderPos;

    @Override
    public boolean createOrder(Customer customer, Item item, int quantity) {
        if (item == orderRequestRetriever.retrieve().getItem()) {
            orderPos = true;
        }
        return orderPos;
    }
}



