public class Message {

  String sender;
  String text;

  public Message(String sender, String text) {
    this.sender = sender;
    this.text = text;
  }

  public void displayMessage() {
    System.out.println(sender + ": " + text);
  }
}