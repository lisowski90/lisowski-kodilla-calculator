package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private Customer customer;
    private Item item;
    private int quantity;

    public OrderRequest(Customer customer, Item item, int quantity) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
