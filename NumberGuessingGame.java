import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("=================================");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {

            System.out.print("\nEnter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            }
            else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("\nCongratulations! You guessed the number.");
                System.out.println("The number was: " + secretNumber);
                System.out.println("Number of attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}