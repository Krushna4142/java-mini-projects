public class Contact {

  private String name;
  private String phoneNumber;

  // 🔹 Constructor
  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  // 🔹 Getter for name (used in searching)
  public String getName() {
    return name;
  }

  // 🔹 Display contact details
  public void displayContact() {
    System.out.println("Name  : " + name);
    System.out.println("Phone : " + phoneNumber);
    System.out.println("---------------------------");
  }
}