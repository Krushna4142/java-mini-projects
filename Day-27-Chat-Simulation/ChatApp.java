import java.util.Scanner;

public class ChatApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ChatManager manager = new ChatManager();

    int choice;

    do {

      System.out.println("\n===== CHAT SYSTEM =====");
      System.out.println("1. Send Message");
      System.out.println("2. View Chat");
      System.out.println("3. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();

      switch (choice) {

        case 1:
          manager.sendMessage();
          break;

        case 2:
          manager.viewChat();
          break;

        case 3:
          System.out.println("Exiting Chat...");
          break;

        default:
          System.out.println("Invalid Choice!");
      }

    } while (choice != 3);

    sc.close();
  }
}