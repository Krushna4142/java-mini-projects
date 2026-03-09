public class BankAccount {

  String accountHolder;
  double balance;

  public BankAccount(String accountHolder) {
    this.accountHolder = accountHolder;
    this.balance = 0;
  }

  public void deposit(double amount) {

    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit successful.");
    } else {
      System.out.println("Invalid deposit amount.");
    }

  }

  public void withdraw(double amount) {

    if (amount <= balance && amount > 0) {
      balance -= amount;
      System.out.println("Withdrawal successful.");
    } else {
      System.out.println("Insufficient balance or invalid amount.");
    }

  }

  public void checkBalance() {

    System.out.println("Current Balance: $" + balance);

  }
}