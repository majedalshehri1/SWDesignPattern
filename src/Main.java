
public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        // Create a new release book
        Book newReleaseBook = BookFactory.createBook("NewRelease", "Harry Potter and the Cursed Child", author, 20.00);
        // Create a second-hand book
        Book secondHandBook = BookFactory.createBook("SecondHand", "Harry Potter and the Cursed Child", author, 20.00);

        // Display the details of the books
        System.out.println("New Release Book: " + newReleaseBook.getTitle() + ", Price: $" + newReleaseBook.getPrice());
        System.out.println("Second Hand Book: " + secondHandBook.getTitle() + ", Price: $" + secondHandBook.getPrice());

        // You can proceed with adding these books to an order or inventory as per the rest of your application flow
        Customer customer = new Customer("Majed", "2344565431");
        Order order = new Order(customer);
        order.addBook(newReleaseBook);
        order.addBook(secondHandBook);

        System.out.println("Total for the order of the two types of books: $" + order.getTotalPrice());

        order.setPricingStrategy(new DiscountPriceStrategy(0.10)); // Apply a 10% discount

        // Decorate the book with gift wrapping and add to the order
        Book giftWrappedBook = new GiftWrappedBook(newReleaseBook);
        order.addBook(giftWrappedBook);

        // Print the price of the gift-wrapped book, including the discount
        double priceAfterDiscount = order.executePricingStrategy(giftWrappedBook);
        System.out.println("Price of gift-wrapped new release '" + newReleaseBook.getTitle() + "' after 10% discount: $" + priceAfterDiscount);

        // Singleton and Observer patterns
        InventoryManager inventoryManager = InventoryManager.getInstance();
        SalesManager salesManager = new SalesManager();
        inventoryManager.addObserver(salesManager);
        inventoryManager.addBook(newReleaseBook);  // Trigger observer notification

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