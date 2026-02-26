public class Book {

  private int id;
  private String title;
  private String author;
  private boolean isIssued;

  // Constructor
  public Book(int id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.isIssued = false;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isIssued() {
    return isIssued;
  }

  // Methods
  public void issueBook() {
    if (!isIssued) {
      isIssued = true;
      System.out.println("📕 Book issued successfully!");
    } else {
      System.out.println("❌ Book already issued.");
    }
  }

  public void returnBook() {
    if (isIssued) {
      isIssued = false;
      System.out.println("📗 Book returned successfully!");
    } else {
      System.out.println("❌ Book was not issued.");
    }
  }

  public void display() {
    System.out.println(id + " | " + title + " | " + author + " | "
        + (isIssued ? "Issued" : "Available"));
  }
}