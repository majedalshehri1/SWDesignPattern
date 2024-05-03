public class BookFactory {
    public static Book createBook(String title, Author author, double price) {
        return new Book(title, author, price);
    }
}
