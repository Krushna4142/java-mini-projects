import java.util.Scanner;

public class InventoryApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    InventoryManager manager = new InventoryManager();

    int choice;

    do {

      System.out.println("\n===== INVENTORY SYSTEM =====");
      System.out.println("1. Add Product");
      System.out.println("2. View Products");
      System.out.println("3. Update Quantity");
      System.out.println("4. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          manager.addProduct();
          break;

        case 2:
          manager.viewProducts();
          break;

        case 3:
          manager.updateQuantity();
          break;

        case 4:
          System.out.println("Exiting System...");
          break;

        default:
          System.out.println("Invalid choice!");
      }

    } while (choice != 4);

    sc.close();
  }
}