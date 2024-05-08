import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it within 10 attempts.");
        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number correctly.");
                return;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            
            attempts++;
        }
        
        System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
    }
}
