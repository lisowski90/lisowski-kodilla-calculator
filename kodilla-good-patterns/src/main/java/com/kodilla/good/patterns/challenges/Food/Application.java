package com.kodilla.good.patterns.challenges.Food;

public class Application {
    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        Order order = orderReceiver.receive(orderReceiver.order1);

        System.out.println(order);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.doIt(order);
    }
}
