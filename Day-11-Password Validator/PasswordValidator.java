import java.util.Scanner;

public class PasswordValidator {

    // 🔹 Method to check password strength
    public static boolean isValidPassword(String password) {

        // Minimum length check
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // 🔍 Traverse each character
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        // ✅ Final validation
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("✅ Strong Password");
        } else {
            System.out.println("❌ Weak Password");
            System.out.println("Password must contain:");
            System.out.println("• Minimum 8 characters");
            System.out.println("• At least one uppercase letter");
            System.out.println("• At least one lowercase letter");
            System.out.println("• At least one digit");
            System.out.println("• At least one special character");
        }

        sc.close();
    }
}