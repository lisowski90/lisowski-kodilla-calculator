package com.kodilla.good.patterns.challenges;

public interface OrdersDatabase {
    public boolean createOrder(Customer customer, Item item, int quantity);
}
