import java.util.Scanner;

public class LoginApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Default user
    User user = new User("admin", "admin123");

    LoginManager loginManager = new LoginManager(user);

    System.out.println("==== LOGIN SYSTEM ====");

    while (true) {

      System.out.print("Enter Username: ");
      String username = scanner.nextLine();

      System.out.print("Enter Password: ");
      String password = scanner.nextLine();

      boolean success = loginManager.login(username, password);

      if (success) {
        break;
      }

      if (success == false) {
        if (username.equals("exit")) {
          break;
        }
      }
    }

    scanner.close();
  }
}