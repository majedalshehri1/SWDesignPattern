
public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        Book book = BookFactory.createBook("Harry Potter", author, 29.99);

        Customer customer = new Customer("Majed", "2344565431");
        Order order = new Order(customer);
        order.setPricingStrategy(new DiscountPriceStrategy(0.10)); // Apply a 10% discount

        // Decorate the book with gift wrapping and add to the order
        GiftWrappedBook giftWrappedBook = new GiftWrappedBook(book);
        order.addBook(giftWrappedBook);

        // Print the price of the gift-wrapped book, including the discount
        double priceAfterDiscount = order.getPricingStrategy().calculatePrice(giftWrappedBook);
        System.out.println("Price of gift-wrapped '" + book.getTitle() + "' after 10% discount: $" + priceAfterDiscount);

        // Singleton and Observer patterns
        InventoryManager inventoryManager = InventoryManager.getInstance();
        SalesManager salesManager = new SalesManager();
        inventoryManager.addObserver(salesManager);
        inventoryManager.addBook(book);  // Trigger observer notification

        // Adapter pattern for payments
        PaymentProcessor processor = new PaymentProcessor();
        Payment payment = new PaymentAdapter(processor, "123-456-789");
        salesManager.processOrder(order, payment);

        // Output final details
        System.out.println("Buyer: " + customer.getName());
        double total = order.getTotalPrice();
        System.out.printf("Order processed with total due: $%.2f\n", total);
    }
}