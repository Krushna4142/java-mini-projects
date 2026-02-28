import java.util.Scanner;

public class ExpenseApp {

  public static void main(String[] args) {

    ExpenseManager manager = new ExpenseManager();
    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("\n===== 💰 Expense Tracker =====");
      System.out.println("1. Add Expense");
      System.out.println("2. View Expenses");
      System.out.println("3. Delete Expense");
      System.out.println("4. Show Total Expense");
      System.out.println("5. Exit");
      System.out.print("Enter choice: ");

      int choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.print("Enter Expense ID: ");
          int id = sc.nextInt();

          System.out.print("Enter Amount: ");
          double amount = sc.nextDouble();
          sc.nextLine(); // consume newline

          System.out.print("Enter Category: ");
          String category = sc.nextLine();

          System.out.print("Enter Date (dd-mm-yyyy): ");
          String date = sc.nextLine();

          Expense expense = new Expense(id, amount, category, date);
          manager.addExpense(expense);
          break;

        case 2:
          manager.viewExpenses();
          break;

        case 3:
          System.out.print("Enter Expense ID to delete: ");
          int deleteId = sc.nextInt();
          manager.deleteExpense(deleteId);
          break;

        case 4:
          manager.showTotalExpense();
          break;

        case 5:
          System.out.println("👋 Exiting... Thank You!");
          sc.close();
          return;

        default:
          System.out.println("❌ Invalid choice.");
      }
    }
  }
}