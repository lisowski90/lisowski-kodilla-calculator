package Food2Door;

public class OrderProcessor {
    private OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final Order order) {
        boolean isDone = orderService.sell(order);
        if(isDone) {
            return new OrderDto(order.getCustomer(), true);
        }
        else {
            return new OrderDto(order.getCustomer(), false);
        }
    }
}
