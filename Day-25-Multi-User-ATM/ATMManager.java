import java.util.Scanner;

public class ATMManager {

  Account[] accounts = new Account[50];
  int count = 0;

  Scanner sc = new Scanner(System.in);

  public void addAccount() {

    System.out.print("Enter Account Number: ");
    int accNo = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Account Holder Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Initial Balance: ");
    double balance = sc.nextDouble();

    accounts[count] = new Account(accNo, name, balance);
    count++;

    System.out.println("Account Created Successfully!");
  }

  public Account findAccount(int accNo) {

    for (int i = 0; i < count; i++) {
      if (accounts[i].accountNumber == accNo) {
        return accounts[i];
      }
    }

    return null;
  }

  public void performOperations() {

    System.out.print("Enter Account Number: ");
    int accNo = sc.nextInt();

    Account acc = findAccount(accNo);

    if (acc == null) {
      System.out.println("Account not found.");
      return;
    }

    int choice;

    do {
      System.out.println("\n--- ATM MENU ---");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.println("Balance: " + acc.balance);
          break;

        case 2:
          System.out.print("Enter amount to deposit: ");
          double deposit = sc.nextDouble();
          acc.balance += deposit;
          System.out.println("Amount Deposited!");
          break;

        case 3:
          System.out.print("Enter amount to withdraw: ");
          double withdraw = sc.nextDouble();

          if (acc.balance >= withdraw) {
            acc.balance -= withdraw;
            System.out.println("Withdrawal Successful!");
          } else {
            System.out.println("Insufficient Balance!");
          }
          break;

        case 4:
          System.out.println("Exiting ATM Menu...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 4);
  }
}