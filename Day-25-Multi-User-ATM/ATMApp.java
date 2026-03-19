import java.util.Scanner;

public class ATMApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ATMManager manager = new ATMManager();

    int choice;

    do {

      System.out.println("\n===== MULTI-USER ATM SYSTEM =====");
      System.out.println("1. Create Account");
      System.out.println("2. Access Account");
      System.out.println("3. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          manager.addAccount();
          break;

        case 2:
          manager.performOperations();
          break;

        case 3:
          System.out.println("Exiting System...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 3);

    sc.close();
  }
}