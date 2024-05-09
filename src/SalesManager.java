import java.util.*;

public class SalesManager implements InventoryObserver {
    private List<Order> orders;

    public SalesManager() {
        this.orders = new ArrayList<>();
    }


    public void processOrder(Order order, Payment payment ) {
        orders.add(order);
        order.processPayment(payment);
    }

    public void update(Book book, String action) {
        System.out.println("Sales Manager notified about book: " + book.getTitle() + ", Action: " + action);
    }

    // Getters and setters
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
