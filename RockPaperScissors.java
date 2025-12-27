import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String comp, user, playAgain = "y";
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        do {
            int num = rand.nextInt(1, 101);
            if (num >= 1 && num < 33) {
                comp = "Rock";
            } else if (num >= 33 && num < 66) {
                comp = "Paper";
            } else {
                comp = "Scissors";
            }
            System.out.println("Enter r for rock, p for paper and s for scissors");
            user = sc.nextLine().toLowerCase();
            if (user.equals("r")) {
                user = "Rock";
            } else if (user.equals("p")) {
                user = "Paper";
            } else if (user.equals("s")) {
                user = "Scissors";
            } else {
                System.out.println("Invalid input by user");
                continue;
            }
            if (comp.equals(user)) {
                System.out.println("Match Drawn");
            } else if (comp.equals("Rock") && user.equals("Scissors")) {
                System.out.println("The computer chose Rock and You Lost!!");
            } else if (comp.equals("Paper") && user.equals("Rock")) {
                System.out.println("The computer chose Paper and You Lost!!");
            } else if (comp.equals("Scissors") && user.equals("Paper")) {
                System.out.println("The computer chose Scissors and You Lost!!");
            } else if (user.equals("Rock") && comp.equals("Scissors")) {
                System.out.println("The computer chose Scissors and You Won!!");
            } else if (user.equals("Paper") && comp.equals("Rock")) {
                System.out.println("The computer chose Rock and You Won!!");
            } else if (user.equals("Scissors") && comp.equals("Paper")) {
                System.out.println("The computer chose Paper and You Won!!");
            }
            System.out.println("Do you want to play again? Type y or n");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("y"));
        sc.close();
    }
}