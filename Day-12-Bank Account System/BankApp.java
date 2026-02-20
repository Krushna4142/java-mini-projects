import java.util.Scanner;

public class BankApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Account Holder Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Account Number: ");
    int accNumber = sc.nextInt();

    System.out.print("Enter Initial Balance: ");
    double balance = sc.nextDouble();

    // 🔹 Creating object
    BankAccount account = new BankAccount(name, accNumber, balance);

    int choice;

    do {
      System.out.println("\n====== 🏦 BANK MENU ======");
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check Balance");
      System.out.println("4. Account Details");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.print("Enter amount to deposit: ");
          double depositAmount = sc.nextDouble();
          account.deposit(depositAmount);
          break;

        case 2:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = sc.nextDouble();
          account.withdraw(withdrawAmount);
          break;

        case 3:
          account.checkBalance();
          break;

        case 4:
          account.displayAccountInfo();
          break;

        case 5:
          System.out.println("🙏 Thank you for using our banking system.");
          break;

        default:
          System.out.println("❌ Invalid choice. Try again.");
      }

    } while (choice != 5);

    sc.close();
  }
}