import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess, attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(min, max + 1);
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);
        do {
            System.out.print("Enter your Guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println(" TOO LOW!! Guess again!");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH!! Guess Again!");
            } else {
                System.out.println("Correct the number was " + randomNumber);
                System.out.println("No. of attempts: " + attempts);
            }
        } while (guess != randomNumber);
    }
}