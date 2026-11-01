
package Assignment2;

public class InventoryApp {
    public static void main(String[] args) {

        // Create books for the bookstore
        Product book1 = new Product("1984", "George Orwell", 12.99, 8);
        Product book2 = new Product("The Hobbit", "J.R.R. Tolkien", 15.50, 3);
        Product book3 = new Product("Dune", "Frank Herbert", 18.00, 6);

        // Display the bookstore inventory
        System.out.println("Bookstore Inventore");

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        // Calculate the total value of all books
        double total = book1.getTotalValue()
                     + book2.getTotalValue()
                     + book3.getTotalValue();

        System.out.printf("Total Store Inventory: $%.2f%n", total);
    }
}