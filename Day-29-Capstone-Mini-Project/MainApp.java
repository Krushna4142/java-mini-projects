import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    SystemManager manager = new SystemManager();

    int choice;

    do {

      System.out.println("\n===== CAPSTONE SYSTEM =====");
      System.out.println("1. Add Record");
      System.out.println("2. View Records");
      System.out.println("3. Generate Summary");
      System.out.println("4. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          manager.addRecord();
          break;

        case 2:
          manager.viewRecords();
          break;

        case 3:
          manager.generateSummary();
          break;

        case 4:
          System.out.println("Exiting System...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 4);

    sc.close();
  }
}