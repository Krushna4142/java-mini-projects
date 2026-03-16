import java.util.Scanner;

public class InventoryManager {

  Product[] products = new Product[50];
  int count = 0;

  Scanner sc = new Scanner(System.in);

  public void addProduct() {

    System.out.print("Enter Product ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Product Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Quantity: ");
    int quantity = sc.nextInt();

    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    products[count] = new Product(id, name, quantity, price);
    count++;

    System.out.println("Product Added Successfully!");
  }

  public void viewProducts() {

    if (count == 0) {
      System.out.println("No products in inventory.");
      return;
    }

    for (int i = 0; i < count; i++) {
      products[i].displayProduct();
    }
  }

  public void updateQuantity() {

    System.out.print("Enter Product ID to update: ");
    int id = sc.nextInt();

    for (int i = 0; i < count; i++) {

      if (products[i].id == id) {

        System.out.print("Enter quantity to add: ");
        int qty = sc.nextInt();

        products[i].quantity += qty;

        System.out.println("Quantity Updated!");
        return;
      }
    }

    System.out.println("Product not found.");
  }
}