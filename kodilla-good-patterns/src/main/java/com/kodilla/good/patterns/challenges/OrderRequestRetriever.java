package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Olaf Snowman", 1);

        Item item = new Item(0, "Snowballs", 5.50);

        return new OrderRequest(customer, item, 5);
    }
}
