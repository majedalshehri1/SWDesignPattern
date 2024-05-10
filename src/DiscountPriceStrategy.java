class DiscountPriceStrategy implements PricingStrategy {
    private double discountRate;

    public DiscountPriceStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice(Book book) {
        return book.getPrice() * (1 - discountRate);
    }
}