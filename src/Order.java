import java.util.*;

public class Order {
    private Customer customer;
    private List<Book> books;
    private double totalPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.books = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addBook(Book book) {
        books.add(book);
        totalPrice += book.getPrice();
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
