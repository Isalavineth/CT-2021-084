package Q_06;

import java.util.Random;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Create a random number object
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("Guess a number between 1 and 100:");
        // Read the user's guess
        int guess = scanner.nextInt();

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            if (guess < randomNumber)
                System.out.println("Try again (hint: higher):");
            else
                System.out.println("Try again (hint: lower):");
            guess = scanner.nextInt();
        }
        // Output the correct guess
        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly.");
    }
}
