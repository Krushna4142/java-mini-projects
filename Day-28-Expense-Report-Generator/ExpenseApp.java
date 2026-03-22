import java.util.Scanner;

public class ExpenseApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ExpenseManager manager = new ExpenseManager();

    int choice;

    do {

      System.out.println("\n===== EXPENSE TRACKER =====");
      System.out.println("1. Add Expense");
      System.out.println("2. View Expenses");
      System.out.println("3. Generate Report");
      System.out.println("4. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          manager.addExpense();
          break;

        case 2:
          manager.viewExpenses();
          break;

        case 3:
          manager.generateReport();
          break;

        case 4:
          System.out.println("Exiting Application...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 4);

    sc.close();
  }
}