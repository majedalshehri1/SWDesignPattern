public class NewReleaseBook extends Book{
    public NewReleaseBook(String title, Author author, double price) {
        super(title, author, price + 5.00);
    }
}
