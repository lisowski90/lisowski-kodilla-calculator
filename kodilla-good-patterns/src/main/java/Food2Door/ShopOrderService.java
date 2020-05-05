package Food2Door;

import java.util.List;

public class ShopOrderService implements OrderService {

    public boolean sell(Order order){
        List<String> storage = order.getShop().getShopStorage();
        boolean compare = storage.contains(order.getItems().toString());
        return compare;
    }
}
