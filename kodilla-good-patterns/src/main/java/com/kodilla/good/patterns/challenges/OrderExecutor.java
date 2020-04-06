package com.kodilla.good.patterns.challenges;

public class OrderExecutor implements OrdeService {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    boolean orderPos;

    @Override
    public boolean orderExecute(Customer customer, Item item, int quantity) {
        if (item == orderRequestRetriever.retrieve().getItem()) {
            orderPos = true;
        }
        return orderPos;
    }
}
