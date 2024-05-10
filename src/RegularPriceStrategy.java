class RegularPriceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Book book) {
        return book.getPrice();
    }
}