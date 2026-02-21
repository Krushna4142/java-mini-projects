import java.util.Scanner;

public class ContactBookApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Contact[] contacts = new Contact[100]; // Array to store contacts
    int totalContacts = 0;

    int choice;

    do {
      System.out.println("\n📒 CONTACT BOOK MENU");
      System.out.println("1. Add Contact");
      System.out.println("2. View All Contacts");
      System.out.println("3. Search Contact");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

      choice = sc.nextInt();
      sc.nextLine(); // consume newline

      switch (choice) {

        case 1:
          if (totalContacts < contacts.length) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            contacts[totalContacts] = new Contact(name, phone);
            totalContacts++;

            System.out.println("✅ Contact added successfully!");

          } else {
            System.out.println("❌ Contact list is full!");
          }
          break;

        case 2:
          if (totalContacts == 0) {
            System.out.println("⚠️ No contacts available.");
          } else {
            System.out.println("\n📋 Contact List:");
            for (int i = 0; i < totalContacts; i++) {
              contacts[i].displayContact();
            }
          }
          break;

        case 3:
          System.out.print("Enter name to search: ");
          String searchName = sc.nextLine();

          boolean found = false;

          for (int i = 0; i < totalContacts; i++) {
            if (contacts[i].getName().equalsIgnoreCase(searchName)) {
              System.out.println("\n✅ Contact Found:");
              contacts[i].displayContact();
              found = true;
              break;
            }
          }

          if (!found) {
            System.out.println("❌ Contact not found.");
          }
          break;

        case 4:
          System.out.println("🙏 Exiting Contact Book.");
          break;

        default:
          System.out.println("❌ Invalid choice. Try again.");
      }

    } while (choice != 4);

    sc.close();
  }
}