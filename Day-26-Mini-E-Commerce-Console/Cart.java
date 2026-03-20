public class Cart {

  Product[] items = new Product[50];
  int count = 0;

  public void addProduct(Product product) {
    items[count] = product;
    count++;
    System.out.println("Product added to cart!");
  }

  public void viewCart() {

    if (count == 0) {
      System.out.println("Cart is empty.");
      return;
    }

    double total = 0;

    System.out.println("\n--- Your Cart ---");

    for (int i = 0; i < count; i++) {
      items[i].displayProduct();
      total += items[i].price;
    }

    System.out.println("Total Amount: ₹" + total);
  }

  public void checkout() {

    if (count == 0) {
      System.out.println("Cart is empty. Cannot checkout.");
      return;
    }

    double total = 0;

    for (int i = 0; i < count; i++) {
      total += items[i].price;
    }

    System.out.println("Final Bill: ₹" + total);
    System.out.println("Thank you for shopping!");

    count = 0; // clear cart after checkout
  }
}