import java.io.*;
import java.util.Scanner;

public class ContactManager {

  Scanner sc = new Scanner(System.in);
  String fileName = "contacts.txt";

  public void addContact() {

    try {

      System.out.print("Enter Contact Name: ");
      String name = sc.nextLine();

      System.out.print("Enter Phone Number: ");
      String phone = sc.nextLine();

      Contact contact = new Contact(name, phone);

      FileWriter writer = new FileWriter(fileName, true);
      writer.write(contact.toFileString() + "\n");
      writer.close();

      System.out.println("Contact Saved Successfully!");

    } catch (Exception e) {
      System.out.println("Error saving contact.");
    }
  }

  public void viewContacts() {

    try {

      FileReader fr = new FileReader(fileName);
      BufferedReader reader = new BufferedReader(fr);

      String line;

      System.out.println("\nSaved Contacts:");

      while ((line = reader.readLine()) != null) {

        String[] data = line.split(",");

        Contact contact = new Contact(data[0], data[1]);
        contact.displayContact();
      }

      reader.close();

    } catch (Exception e) {
      System.out.println("No contacts found.");
    }
  }
}