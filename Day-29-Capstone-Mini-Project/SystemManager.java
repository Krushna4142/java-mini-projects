import java.util.Scanner;

public class SystemManager {

  Record[] records = new Record[100];
  int count = 0;

  Scanner sc = new Scanner(System.in);

  public void addRecord() {

    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    records[count] = new Record(id, name);
    count++;

    System.out.println("Record Added Successfully!");
  }

  public void viewRecords() {

    if (count == 0) {
      System.out.println("No records available.");
      return;
    }

    System.out.println("\n--- Records List ---");

    for (int i = 0; i < count; i++) {
      records[i].displayRecord();
    }
  }

  public void generateSummary() {

    System.out.println("\n--- System Summary ---");
    System.out.println("Total Records: " + count);
  }
}