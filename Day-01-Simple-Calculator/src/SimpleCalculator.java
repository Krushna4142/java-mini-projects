import java.util.Scanner;

public class SimpleCalculator {

  // Method for addition
  public static double add(double a, double b) {
    return a + b;
  }

  // Method for subtraction
  public static double subtract(double a, double b) {
    return a - b;
  }

  // Method for multiplication
  public static double multiply(double a, double b) {
    return a * b;
  }

  // Method for division
  public static double divide(double a, double b) {
    if (b == 0) {
      System.out.println("Error: Division by zero is not allowed.");
      return 0;
    }
    return a / b;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    System.out.println("\nChoose operation:");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.print("Enter choice: ");

    int choice = scanner.nextInt();
    double result;

    switch (choice) {
      case 1:
        result = add(num1, num2);
        break;
      case 2:
        result = subtract(num1, num2);
        break;
      case 3:
        result = multiply(num1, num2);
        break;
      case 4:
        result = divide(num1, num2);
        break;
      default:
        System.out.println("Invalid choice.");
        return;
    }

    System.out.println("\nResult: " + result);
    scanner.close();
  }
}