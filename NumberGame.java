import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Game!");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int userGuess;

            System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + minRange + " and " + maxRange);

            do {
                System.out.print("Take a guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("WOW Congratulations! You guessed the correct number in " + attempts + " attempts.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Oh no its too low.Try Again!");
                } else {
                    System.out.println("Oh no its too high.Try Again!");
                }

            } while (userGuess != targetNumber && attempts < attemptsLimit);

            totalAttempts += attempts;
            rounds++;

            System.out.print("Would you like to play again? (yup/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        System.out.println("\nBad Luck...\nGame Over! You played " + rounds + " rounds and took " + totalAttempts + " attempts.");
        scanner.close();
    }
}
