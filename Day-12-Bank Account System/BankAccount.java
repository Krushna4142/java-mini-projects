public class BankAccount {

  private String accountHolderName;
  private int accountNumber;
  private double balance;

  // 🔹 Constructor
  public BankAccount(String accountHolderName, int accountNumber, double balance) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  // 🔹 Deposit Method
  public void deposit(double amount) {

    if (amount > 0) {
      balance += amount;
      System.out.println("✅ Amount Deposited: ₹" + amount);
    } else {
      System.out.println("❌ Invalid deposit amount");
    }
  }

  // 🔹 Withdraw Method
  public void withdraw(double amount) {

    if (amount <= balance && amount > 0) {
      balance -= amount;
      System.out.println("✅ Amount Withdrawn: ₹" + amount);
    } else {
      System.out.println("❌ Insufficient balance or invalid amount");
    }
  }

  // 🔹 Check Balance
  public void checkBalance() {
    System.out.println("💰 Current Balance: ₹" + balance);
  }

  // 🔹 Display Account Details
  public void displayAccountInfo() {
    System.out.println("\n🏦 Account Details");
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Account Number: " + accountNumber);
  }
}