public class BookFactory {
    public static Book createBook(String type, String title, Author author, double price) {
        switch (type) {
            case "NewRelease":
                return new NewReleaseBook(title, author, price);
            case "SecondHand":
                return new SecondHandBook(title, author, price);
            default:
                return new Book(title, author, price);
        }
    }
}
