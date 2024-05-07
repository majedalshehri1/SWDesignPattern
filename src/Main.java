
public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");

        // Using Factory pattern
        Book book = BookFactory.createBook("Harry Potter", author, 29.99);
        Customer customer = new Customer("Majed", "2344565431");
        Order order = new Order(customer);
        order.addBook(book);


        SalesManager salesManager = new SalesManager();
        PaymentProcessor processor = new PaymentProcessor();
        Payment payment = new PaymentAdapter(processor, "123-456-789");
        // Using Adapter pattern
        salesManager.processOrder(order, payment);


        // Using Singleton pattern
        InventoryManager inventoryManager = InventoryManager.getInstance();
        inventoryManager.addBook(book);

        System.out.println("Book ordered: " + order.getBooks().get(0).getTitle());
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("Buyer: " + customer.getName());

    }
}