import java.util.Scanner;

public class BankingApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("===== Welcome to Mini Banking System =====");

    System.out.print("Enter account holder name: ");
    String name = scanner.nextLine();

    BankService bankService = new BankService(name);

    bankService.start();

    scanner.close();
  }
}