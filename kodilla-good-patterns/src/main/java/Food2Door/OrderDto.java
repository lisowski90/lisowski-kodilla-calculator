package Food2Door;

public class OrderDto {
    public Customer customer;
    public boolean isDone;

    public OrderDto(Customer customer, boolean isDone) {
        this.customer = customer;
        this.isDone = isDone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isDone() {
        return isDone;
    }
}
