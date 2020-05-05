package com.kodilla.good.patterns.challenges.Food;

public class OrderDTO {
    public Order order;
    public boolean isDone;

    public OrderDTO(Order order, boolean isDone) {
        this.order = order;
        this.isDone = isDone;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isDone() {
        return isDone;
    }
}
