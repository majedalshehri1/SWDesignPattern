abstract class BookDecorator extends Book {
    protected Book book;

    public BookDecorator(Book book) {
        super(book.getTitle(), book.getAuthor(), book.getPrice());
        this.book = book;
    }
}
