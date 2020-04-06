package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Customer customer;
    public boolean isExecuted;

    public OrderDto(Customer customer, boolean isExecuted) {
        this.customer = customer;
        this.isExecuted = isExecuted;
    }

}
