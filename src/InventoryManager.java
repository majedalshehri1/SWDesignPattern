import java.util.*;

public class InventoryManager {

    // Step 1: Private static instance of the class for to use ( Sengelton Pattern )
    private static InventoryManager instance;
    private List<Book> books;
    private List<InventoryObserver> observers = new ArrayList<>();

    // Step 2: Private constructor
    private InventoryManager() {
        this.books = new ArrayList<>();
    }

    // Step 3: Public static method to get the instance
    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(InventoryObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book, String action) {
        for (InventoryObserver observer : observers) {
            observer.update(book, action);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book, "added");
    }

    public void removeBook(Book book) {
        books.remove(book);
        notifyObservers(book, "removed");
    }

    // Getters and setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
