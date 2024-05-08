class GiftWrappedBook extends BookDecorator {
    public GiftWrappedBook(Book book) {
        super(book);
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 5.00; // Adding $5 for gift wrapping
    }
}
