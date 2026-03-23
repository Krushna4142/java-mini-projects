public class Record {

  int id;
  String name;

  public Record(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void displayRecord() {
    System.out.println("ID: " + id + " | Name: " + name);
  }
}