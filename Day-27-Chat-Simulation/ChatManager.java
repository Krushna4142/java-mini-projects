import java.util.Scanner;

public class ChatManager {

  Message[] messages = new Message[100];
  int count = 0;

  Scanner sc = new Scanner(System.in);

  public void sendMessage() {

    sc.nextLine(); // clear buffer

    System.out.print("Enter Sender Name: ");
    String sender = sc.nextLine();

    System.out.print("Enter Message: ");
    String text = sc.nextLine();

    messages[count] = new Message(sender, text);
    count++;

    // Simulated reply
    messages[count] = new Message("Bot", "Message received!");
    count++;

    System.out.println("Message Sent!");
  }

  public void viewChat() {

    if (count == 0) {
      System.out.println("No messages yet.");
      return;
    }

    System.out.println("\n--- Chat History ---");

    for (int i = 0; i < count; i++) {
      messages[i].displayMessage();
    }
  }
}