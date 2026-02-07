
import java.util.Scanner;

public class NumberChecker {

    // Method to check whether a number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Method to check whether a number is prime
    public static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is NOT a Prime number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println();
        checkEvenOdd(number);
        checkPrime(number);

        scanner.close();
    }
}
