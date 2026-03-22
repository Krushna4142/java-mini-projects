public class Expense {

  String category;
  double amount;

  public Expense(String category, double amount) {
    this.category = category;
    this.amount = amount;
  }

  public void displayExpense() {
    System.out.println("Category: " + category + " | Amount: ₹" + amount);
  }
}