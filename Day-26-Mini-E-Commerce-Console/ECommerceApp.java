import java.util.Scanner;

public class ECommerceApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Cart cart = new Cart();

    Product[] products = {
        new Product(1, "Laptop", 50000),
        new Product(2, "Smartphone", 20000),
        new Product(3, "Headphones", 2000),
        new Product(4, "Keyboard", 1500)
    };

    int choice;

    do {

      System.out.println("\n===== MINI E-COMMERCE =====");
      System.out.println("1. View Products");
      System.out.println("2. Add to Cart");
      System.out.println("3. View Cart");
      System.out.println("4. Checkout");
      System.out.println("5. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.println("\n--- Product List ---");
          for (Product p : products) {
            p.displayProduct();
          }
          break;

        case 2:
          System.out.print("Enter Product ID to add: ");
          int id = sc.nextInt();

          boolean found = false;

          for (Product p : products) {
            if (p.id == id) {
              cart.addProduct(p);
              found = true;
              break;
            }
          }

          if (!found) {
            System.out.println("Invalid Product ID!");
          }
          break;

        case 3:
          cart.viewCart();
          break;

        case 4:
          cart.checkout();
          break;

        case 5:
          System.out.println("Exiting Application...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 5);

    sc.close();
  }
}