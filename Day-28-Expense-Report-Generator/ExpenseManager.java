import java.util.Scanner;

public class ExpenseManager {

  Expense[] expenses = new Expense[100];
  int count = 0;

  Scanner sc = new Scanner(System.in);

  public void addExpense() {

    sc.nextLine(); // clear buffer

    System.out.print("Enter Category: ");
    String category = sc.nextLine();

    System.out.print("Enter Amount: ");
    double amount = sc.nextDouble();

    expenses[count] = new Expense(category, amount);
    count++;

    System.out.println("Expense Added Successfully!");
  }

  public void viewExpenses() {

    if (count == 0) {
      System.out.println("No expenses recorded.");
      return;
    }

    System.out.println("\n--- Expense List ---");

    for (int i = 0; i < count; i++) {
      expenses[i].displayExpense();
    }
  }

  public void generateReport() {

    if (count == 0) {
      System.out.println("No data to generate report.");
      return;
    }

    double total = 0;

    System.out.println("\n--- Expense Report ---");

    for (int i = 0; i < count; i++) {
      expenses[i].displayExpense();
      total += expenses[i].amount;
    }

    System.out.println("-----------------------------");
    System.out.println("Total Expense: ₹" + total);
  }
}