package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {

    private AccountServices accountServices;
    private OrderRepository orderRepository;
    private OrderServices orderServices;

    public OrderProcessor(final AccountServices accountServices, final OrderRepository orderRepository, final OrderServices orderServices) {
        this.accountServices = accountServices;
        this.orderRepository = orderRepository;
        this.orderServices = orderServices;
    }

    public boolean process(OrderRequest orderRequest) {
        boolean isRealized = orderServices.realize(orderRequest.getShop(), orderRequest.getOrder());
        if (isRealized) {
            accountServices.payment(orderRequest.getShop());
            orderRepository.createOrder(orderRequest.getOrder());
            return true;
        } else {
            return false;
        }
    }

    ;
}
