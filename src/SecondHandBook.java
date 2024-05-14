public class SecondHandBook extends Book{
    public SecondHandBook(String title, Author author, double price) {
        super(title, author, price * 0.75);
    }
}
