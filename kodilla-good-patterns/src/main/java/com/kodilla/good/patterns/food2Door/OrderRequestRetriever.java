package com.kodilla.good.patterns.food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Shop shop = new ExtraFoodShop();
        Product product = new Product("milk", 5);

        Order order = new Order(shop, product, 3);

        shop.addProduct(product);

        return new OrderRequest(shop, order);
    }
}
