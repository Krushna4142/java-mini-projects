import java.util.Scanner;

public class ContactApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ContactManager manager = new ContactManager();

    int choice;

    do {

      System.out.println("\n===== CONTACT BOOK =====");
      System.out.println("1. Add Contact");
      System.out.println("2. View Contacts");
      System.out.println("3. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {

        case 1:
          manager.addContact();
          break;

        case 2:
          manager.viewContacts();
          break;

        case 3:
          System.out.println("Exiting Contact Book...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 3);

    sc.close();
  }
}