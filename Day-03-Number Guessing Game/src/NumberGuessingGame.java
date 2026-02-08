import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // Generate a random number between 1 and 100
    int targetNumber = random.nextInt(100) + 1;

    int userGuess = 0;
    int attempts = 0;

    System.out.println("🎮 Welcome to the Number Guessing Game!");
    System.out.println("I have selected a number between 1 and 100.");
    System.out.println("Try to guess it!\n");

    // Game loop
    while (userGuess != targetNumber) {

      System.out.print("Enter your guess: ");
      userGuess = scanner.nextInt();
      attempts++;

      if (userGuess > targetNumber) {
        System.out.println("Too High! Try again.\n");
      } else if (userGuess < targetNumber) {
        System.out.println("Too Low! Try again.\n");
      } else {
        System.out.println("🎉 Congratulations!");
        System.out.println("You guessed the correct number: " + targetNumber);
        System.out.println("Total attempts: " + attempts);
      }
    }

    scanner.close();
  }
}