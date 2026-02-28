import java.util.ArrayList;

public class ExpenseManager {

  private ArrayList<Expense> expenses;

  public ExpenseManager() {
    expenses = new ArrayList<>();
  }

  // Add Expense
  public void addExpense(Expense expense) {
    expenses.add(expense);
    System.out.println("✅ Expense added successfully!");
  }

  // View All Expenses
  public void viewExpenses() {

    if (expenses.isEmpty()) {
      System.out.println("⚠ No expenses recorded.");
      return;
    }

    for (Expense expense : expenses) {
      expense.display();
    }
  }

  // Delete Expense by ID
  public void deleteExpense(int id) {

    Expense target = null;

    for (Expense expense : expenses) {
      if (expense.getId() == id) {
        target = expense;
        break;
      }
    }

    if (target != null) {
      expenses.remove(target);
      System.out.println("🗑 Expense deleted successfully!");
    } else {
      System.out.println("❌ Expense not found.");
    }
  }

  // Calculate Total Expense
  public void showTotalExpense() {

    double total = 0;

    for (Expense expense : expenses) {
      total += expense.getAmount();
    }

    System.out.println("💰 Total Expense: ₹" + total);
  }
}