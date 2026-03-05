import java.io.*;
import java.util.Scanner;

public class FileHandlingApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int choice;

    do {

      System.out.println("\n===== File Handling Menu =====");
      System.out.println("1. Write to File");
      System.out.println("2. Read File");
      System.out.println("3. Exit");

      System.out.print("Enter choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {

        case 1:

          try {

            FileWriter writer = new FileWriter("data.txt", true);

            System.out.print("Enter text to save: ");
            String text = scanner.nextLine();

            writer.write(text + "\n");

            writer.close();

            System.out.println("Data saved successfully.");

          } catch (Exception e) {

            System.out.println("Error writing to file.");

          }

          break;

        case 2:

          try {

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

            String line;

            System.out.println("\nSaved Data:\n");

            while ((line = reader.readLine()) != null) {

              System.out.println(line);

            }

            reader.close();

          } catch (Exception e) {

            System.out.println("Error reading file.");

          }

          break;

        case 3:

          System.out.println("Exiting program...");

          break;

        default:

          System.out.println("Invalid choice.");

      }

    } while (choice != 3);

    scanner.close();
  }
}