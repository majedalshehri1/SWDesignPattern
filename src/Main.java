
public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");


        // Using Factory pattern
        Book book = BookFactory.createBook("Harry Potter", author, 29.99);


        // Applying Strategy pattern for pricing
        Customer customer = new Customer("Majed", "2344565431");
        Order order = new Order(customer);
        order.setPricingStrategy(new DiscountPriceStrategy(0.10));
        order.addBook(book);

        // Using Decorator pattern
        GiftWrappedBook giftWrappedBook = new GiftWrappedBook(book);
        order.addBook(giftWrappedBook);


        // Using Singleton and Observer pattern
        InventoryManager inventoryManager = InventoryManager.getInstance();
        SalesManager salesManager = new SalesManager();
        inventoryManager.addObserver(salesManager);
        inventoryManager.addBook(book);

        // Using Adapter pattern for payments
        PaymentProcessor processor = new PaymentProcessor();
        Payment payment = new PaymentAdapter(processor, "123-456-789");
        salesManager.processOrder(order, payment);

        System.out.println("Book ordered: " + giftWrappedBook.getTitle() + ", Price: " + giftWrappedBook.getPrice());
        System.out.println("Buyer: " + customer.getName());
        System.out.println("Order processed with total due: $" + order.getTotalPrice());


    }
}