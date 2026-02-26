import java.util.ArrayList;

public class Library {

  private ArrayList<Book> books;

  public Library() {
    books = new ArrayList<>();
  }

  // Add Book
  public void addBook(Book book) {
    books.add(book);
    System.out.println("✅ Book added successfully!");
  }

  // Show All Books
  public void showBooks() {
    if (books.isEmpty()) {
      System.out.println("⚠ No books available.");
      return;
    }

    for (Book book : books) {
      book.display();
    }
  }

  // Find Book By ID
  private Book findBookById(int id) {
    for (Book book : books) {
      if (book.getId() == id) {
        return book;
      }
    }
    return null;
  }

  // Issue Book
  public void issueBook(int id) {
    Book book = findBookById(id);

    if (book != null) {
      book.issueBook();
    } else {
      System.out.println("❌ Book not found.");
    }
  }

  // Return Book
  public void returnBook(int id) {
    Book book = findBookById(id);

    if (book != null) {
      book.returnBook();
    } else {
      System.out.println("❌ Book not found.");
    }
  }
}