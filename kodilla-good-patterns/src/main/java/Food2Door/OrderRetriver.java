package Food2Door;

public class OrderRetriver {

    public Order retrieve() {

        Customer customer = new Customer("Jaś", "cebulowa", "997");

        final Shop shop = new Shop(1, "GlutenFreeShop");

        Items items = new Items("Cebula");
        int quantity = 5;
        return new Order(customer, items, quantity, shop);
    }
}
