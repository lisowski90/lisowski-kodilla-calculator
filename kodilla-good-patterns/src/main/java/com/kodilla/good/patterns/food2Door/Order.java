package com.kodilla.good.patterns.food2Door;

public class Order {
    Shop shop;
    Product product;
    double quantity;

    public Order(Shop shop, Product product, double quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}
