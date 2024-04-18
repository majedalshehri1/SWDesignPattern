
public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        Book book = new Book("Harry Potter", author, 29.99);
        Customer customer = new Customer("Bader", "1234567890");
        Order order = new Order(customer);
        order.addBook(book);

        SalesManager salesManager = new SalesManager();
        salesManager.processOrder(order);

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addBook(book);

        System.out.println("Book ordered: " + order.getBooks().get(0).getTitle());
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("Buyer: " + customer.getName());
    }
}