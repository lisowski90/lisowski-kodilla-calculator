package Food2Door;


public class Order {

    Customer customer;
    Items items;
    int quantity;
    Shop shop;

    public Order(Customer customer, Items items, int quantity, Shop shop) {
        this.customer = customer;
        this.items = items;
        this.quantity = quantity;
        this.shop =shop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Items getItems() {
        return items;
    }

    public int getQuantity() {
        return quantity;
    }

    public Shop getShop() {return shop;}
}
