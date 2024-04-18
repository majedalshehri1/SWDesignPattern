import java.util.*;

public class InventoryManager {

    // Step 1: Private static instance of the class for to use ( Sengelton Pattern )
    private static InventoryManager instance;
    private List<Book> books;
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

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    // Getters and setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
