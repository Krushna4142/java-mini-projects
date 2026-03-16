public class Product {

  int id;
  String name;
  int quantity;
  double price;

  public Product(int id, String name, int quantity, double price) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public void displayProduct() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: " + price);
    System.out.println("----------------------------");
  }
}