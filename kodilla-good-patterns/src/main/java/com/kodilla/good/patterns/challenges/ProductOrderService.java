package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrdeService ordeService;
    private InformationService informationService;
    private OrdersDatabase ordersDatabase;

    public ProductOrderService(final OrdeService ordeService, final InformationService informationService, final OrdersDatabase ordersDatabase) {
        this.ordeService = ordeService;
        this.informationService = informationService;
        this.ordersDatabase = ordersDatabase;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isExecuted = ordeService.orderExecute(orderRequest.getCustomer(), orderRequest.getItem(), orderRequest.getQuantity());
        if(isExecuted) {
            informationService.senOrderInfo(orderRequest.getCustomer());
            ordersDatabase.createOrder(orderRequest.getCustomer(), orderRequest.getItem(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
