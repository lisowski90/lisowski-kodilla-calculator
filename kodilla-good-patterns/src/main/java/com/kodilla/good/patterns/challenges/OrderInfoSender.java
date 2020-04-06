package com.kodilla.good.patterns.challenges;

public class OrderInfoSender implements InformationService {
    @Override
    public void senOrderInfo(Customer customer) {
        System.out.println("Send email to: " + customer);
    }
}
