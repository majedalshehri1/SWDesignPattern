import java.util.*;

public class SalesManager {
    private List<Order> orders;

    public SalesManager() {
        this.orders = new ArrayList<>();
    }

    public void processOrder(Order order, Payment payment ) {
        orders.add(order);
        order.processPayment(payment);
    }

    // Getters and setters
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
