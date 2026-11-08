
package Assignment1b;

public class Product {

    // Book information
    String title;
    String author;
    double price;
    int quantity;

    // Constructor to create a book
    public Product(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate the value of all copies
    public double getTotalValue() {
        return price * quantity;
    }

    // Display book information
    public void displayBook() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Copies Available: " + quantity);

        // Check if the book needs to be restocked
        if (quantity < 5) {
            System.out.println("Status: Restock Needed");
        } else {
            System.out.println("Status: In Stock");
        }

        System.out.printf("Inventory Value: $%.2f%n", getTotalValue());
    }
}
