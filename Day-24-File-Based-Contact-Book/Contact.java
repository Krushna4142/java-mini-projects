public class Contact {

  String name;
  String phone;

  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String toFileString() {
    return name + "," + phone;
  }

  public void displayContact() {
    System.out.println("Name: " + name);
    System.out.println("Phone: " + phone);
    System.out.println("---------------------------");
  }
}