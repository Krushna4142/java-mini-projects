import java.util.Scanner;

class Record {

  int id;
  String name;

  public Record(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void display() {
    System.out.println("ID: " + id + " | Name: " + name);
  }
}

class SystemManager {

  private Record[] records = new Record[100];
  private int count = 0;
  private Scanner sc = new Scanner(System.in);

  public void addRecord() {

    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    records[count] = new Record(id, name);
    count++;

    System.out.println("Record added successfully!");
  }

  public void viewRecords() {

    if (count == 0) {
      System.out.println("No records found.");
      return;
    }

    System.out.println("\n--- Records ---");

    for (int i = 0; i < count; i++) {
      records[i].display();
    }
  }

  public void generateSummary() {
    System.out.println("\nTotal Records: " + count);
  }
}

public class RefactoredSystem {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    SystemManager manager = new SystemManager();

    int choice;

    do {

      displayMenu();
      choice = sc.nextInt();

      handleChoice(choice, manager);

    } while (choice != 4);

    sc.close();
  }

  // Reusable method for menu display
  public static void displayMenu() {
    System.out.println("\n===== FINAL SYSTEM =====");
    System.out.println("1. Add Record");
    System.out.println("2. View Records");
    System.out.println("3. Generate Summary");
    System.out.println("4. Exit");
    System.out.print("Enter Choice: ");
  }

  // Reusable method for handling user choices
  public static void handleChoice(int choice, SystemManager manager) {

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
  }
}