import java.util.Scanner;

public class PayrollApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    PayrollManager manager = new PayrollManager();

    int choice;

    do {

      System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
      System.out.println("1. Add Employee");
      System.out.println("2. View Payroll");
      System.out.println("3. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          manager.addEmployee();
          break;

        case 2:
          manager.viewPayroll();
          break;

        case 3:
          System.out.println("Exiting System...");
          break;

        default:
          System.out.println("Invalid choice!");
      }

    } while (choice != 3);

    sc.close();
  }
}