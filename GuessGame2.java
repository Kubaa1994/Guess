
import java.util.Random;

public class GuessGame2 {
    private int targetNumber;
    private boolean isGameOver;

    public GuessGame2() {
        Random random = new Random();
        targetNumber = random.nextInt(101); // Generate a random number between 0 and 100
        isGameOver = false;
    }

    public void playGame() {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 0 and 100.");

        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        while (!isGameOver) {
            int guess1 = player1.makeGuess();
            int guess2 = player2.makeGuess();

            System.out.println("Player 1 guesses: " + guess1);
            System.out.println("Player 2 guesses: " + guess2);

            if (guess1 == targetNumber || guess2 == targetNumber) {
                isGameOver = true;
                System.out.println("Congratulations! At least one player guessed the correct number.");
            } else if (guess1 < targetNumber && guess2 < targetNumber) {
                System.out.println("Both players guessed too low. Try again.");
            } else if (guess1 > targetNumber && guess2 > targetNumber) {
                System.out.println("Both players guessed too high. Try again.");
            } else {
                System.out.println("One player guessed too low, and the other player guessed too high. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        GuessGame2 game = new GuessGame2();
        game.playGame();
    }
}
