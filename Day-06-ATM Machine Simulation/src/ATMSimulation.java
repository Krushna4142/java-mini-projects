import java.util.Scanner;

public class ATMSimulation {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double balance = 10000; // Initial balance
    int choice;

    System.out.println("===== Welcome to ATM Machine =====");

    while (true) {

      System.out.println("\n------ ATM Menu ------");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit Money");
      System.out.println("3. Withdraw Money");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.println("Your Current Balance: ₹" + balance);
          break;

        case 2:
          System.out.print("Enter amount to deposit: ₹");
          double deposit = sc.nextDouble();
          if (deposit > 0) {
            balance += deposit;
            System.out.println("Deposit Successful!");
            System.out.println("Updated Balance: ₹" + balance);
          } else {
            System.out.println("Invalid Deposit Amount!");
          }
          break;

        case 3:
          System.out.print("Enter amount to withdraw: ₹");
          double withdraw = sc.nextDouble();

          if (withdraw > balance) {
            System.out.println("Insufficient Balance!");
          } else if (withdraw <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
          } else {
            balance -= withdraw;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: ₹" + balance);
          }
          break;

        case 4:
          System.out.println("Thank you for using ATM. Goodbye!");
          sc.close();
          System.exit(0);
          break;

        default:
          System.out.println("Invalid Choice! Please select from 1 to 4.");
      }
    }
  }
}
