import java.util.*;

public class Order {
    private Customer customer;
    private List<Book> books = new ArrayList<>();
    private double totalPrice;
    private PricingStrategy pricingStrategy;


    public Order(Customer customer) {
        this.customer = customer;
        this.pricingStrategy = new RegularPriceStrategy();
    }

    public void addBook(Book book) {
        books.add(book);
        totalPrice += pricingStrategy.calculatePrice(book);
    }

    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
    }


        public double executePricingStrategy (Book book) {
            return pricingStrategy.calculatePrice(book);
    }

    public void processPayment(Payment payment) {
        payment.processPayment(totalPrice);
    }


    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
