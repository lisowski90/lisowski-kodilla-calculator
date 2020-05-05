package Food2Door;

import java.util.List;

public class Aplication {

    public static void main (String[] args) {
        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new ShopOrderService());
        orderProcessor.process(order);

    }
}
