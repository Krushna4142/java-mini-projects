public class LoginManager {

  private User user;
  private int attemptsRemaining = 3;

  public LoginManager(User user) {
    this.user = user;
  }

  public boolean login(String username, String password) {

    if (attemptsRemaining == 0) {
      System.out.println("❌ Account Locked!");
      return false;
    }

    if (user.getUsername().equals(username) &&
        user.getPassword().equals(password)) {

      System.out.println("✅ Login Successful!");
      return true;

    } else {

      attemptsRemaining--;
      System.out.println("❌ Invalid Credentials!");
      System.out.println("Attempts Remaining: " + attemptsRemaining);

      if (attemptsRemaining == 0) {
        System.out.println("🚫 Account Locked After 3 Failed Attempts.");
      }

      return false;
    }
  }
}