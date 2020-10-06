package com.kodilla.good.patterns.food2Door;

public class OrderRequest {

    Order order;

    Shop shop;

    public OrderRequest(Shop shop, Order order) {
        this.order = order;
        this.shop = shop;
    }

    public Order getOrder() {
        return order;
    }

    public Shop getShop() {
        return shop;
    }
}
