package com.kodilla.good.patterns.challenges.Food;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderProcessor {
    private Shop shop;

    //public OrderProcessor(Shop shop) {
       // this.shop = shop;
    //}

    public OrderDTO doIt(Order order) {
        boolean isDone = shop.process(order.getOrderedName());
        if(isDone) {
            shop.sendInfo();
            return new OrderDTO(order, true);
        } else {
            return new OrderDTO(order, false);
        }
    }
}
