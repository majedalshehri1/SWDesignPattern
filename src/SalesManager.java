import java.util.*;

public class SalesManager {
    private List<Order> orders;

    public SalesManager() {
        this.orders = new ArrayList<>();
    }

    public void processOrder(Order order) {
        orders.add(order);
    }

    // Getters and setters
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
