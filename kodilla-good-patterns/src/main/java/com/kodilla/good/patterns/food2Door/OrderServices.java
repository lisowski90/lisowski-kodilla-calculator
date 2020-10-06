package com.kodilla.good.patterns.food2Door;

import java.util.stream.Collectors;

public class OrderServices {

    public boolean realize(final Shop shop, final Order order) {

        Product ordered = shop.getStorage(order.getShop()).stream()
                .filter(o -> o.equals(order.getProduct()))
                .collect(Collectors.toList())
                .get(0);
        if (ordered != null && ordered.getQuantity() >= order.getQuantity()) {
            System.out.println("Order: " + order.getProduct().getName() + " realized from: " + shop.getName());
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }
}
