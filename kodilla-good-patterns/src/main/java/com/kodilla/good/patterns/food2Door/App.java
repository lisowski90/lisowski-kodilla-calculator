package com.kodilla.good.patterns.food2Door;

public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new AccountServices(), new OrderRepository(), new OrderServices());
        orderProcessor.process(orderRequest);
    }
}
