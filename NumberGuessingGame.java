import java.util.Random; // Import the Random class for generating random numbers
import java.util.Scanner; // Import the Scanner class for user input

public class NumberGuessingGame {
    private static final int MAX_ATTEMPTS = 10; // Maximum number of attempts allowed
    private static final int RANGE_START = 1; // Start of the range for the random number
    private static final int RANGE_END = 100; // End of the range for the random number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        Random random = new Random(); // Create a Random object for generating random numbers
        boolean playAgain = true; // Flag to determine if the user wants to play another round
        int totalScore = 0; // Initialize the total score

        while (playAgain) { // Loop for multiple rounds
            int targetNumber = random.nextInt(RANGE_END - RANGE_START + 1) + RANGE_START; // Generate a random number within the specified range
            int attemptsLeft = MAX_ATTEMPTS; // Set the number of attempts for the current round
            boolean hasGuessedCorrectly = false; // Flag to check if the user has guessed correctly

            // Print game introduction and instructions
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a number between " + RANGE_START + " and " + RANGE_END + ".");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

            while (attemptsLeft > 0 && !hasGuessedCorrectly) { // Loop for each attempt in the current round
                System.out.print("Enter your guess: "); // Prompt the user to enter their guess
                int userGuess = scanner.nextInt(); // Read the user's guess
                attemptsLeft--; // Decrement the number of attempts left

                if (userGuess == targetNumber) { // Check if the guess is correct
                    System.out.println("Congratulations! You've guessed the number correctly.");
                    hasGuessedCorrectly = true; // Set the flag to true as the guess is correct
                    totalScore += attemptsLeft; // Update the total score based on remaining attempts
                } else if (userGuess < targetNumber) { // Check if the guess is too low
                    System.out.println("Your guess is too low. Try again.");
                } else { // The guess is too high
                    System.out.println("Your guess is too high. Try again.");
                }

                // Print the number of attempts left
                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!hasGuessedCorrectly) { // If the user runs out of attempts
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }

            // Print the user's current score
            System.out.println("Your current score: " + totalScore);
            System.out.print("Do you want to play again? (yes/no): "); // Ask if the user wants to play another round
            playAgain = scanner.next().equalsIgnoreCase("yes"); // Read the user's response and update the flag
        }

        // Print the final score and thank the user for playing
        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close(); // Close the Scanner object
    }
}
