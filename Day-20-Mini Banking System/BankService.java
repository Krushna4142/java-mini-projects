import java.util.Scanner;

public class BankService {

  BankAccount account;
  Scanner scanner = new Scanner(System.in);

  public BankService(String name) {

    account = new BankAccount(name);

  }

  public void start() {

    int choice;

    do {

      System.out.println("\n===== Mini Banking System =====");
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");

      System.out.print("Enter choice: ");
      choice = scanner.nextInt();

      switch (choice) {

        case 1:

          System.out.print("Enter deposit amount: ");
          double depositAmount = scanner.nextDouble();
          account.deposit(depositAmount);
          break;

        case 2:

          System.out.print("Enter withdrawal amount: ");
          double withdrawAmount = scanner.nextDouble();
          account.withdraw(withdrawAmount);
          break;

        case 3:

          account.checkBalance();
          break;

        case 4:

          System.out.println("Thank you for using the banking system.");
          break;

        default:

          System.out.println("Invalid choice.");

      }

    } while (choice != 4);

  }
}