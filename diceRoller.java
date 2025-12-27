import java.util.Random;
import java.util.Scanner;

public class diceRoller {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numOfDice, total = 0;

        System.out.println("Enter the number of dice to roll:");
        numOfDice = sc.nextInt();

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = rand.nextInt(1, 7);
                printDice(roll);
                System.out.println("You rolled: " + roll);
                System.out.println("======================");
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("No. of dice must be greater than zero!");
        }

        sc.close();
    }

    static void printDice(int roll) {
        String dice1 = """
                 ---------
                |         |
                |    o    |
                |         |
                 ---------
                """;

        String dice2 = """
                 ---------
                | o       |
                |         |
                |       o |
                 ---------
                """;

        String dice3 = """
                 ---------
                | o       |
                |    o    |
                |       o |
                 ---------
                """;

        String dice4 = """
                 ---------
                | o     o |
                |         |
                | o     o |
                 ---------
                """;

        String dice5 = """
                 ---------
                | o     o |
                |    o    |
                | o     o |
                 ---------
                """;

        String dice6 = """
                 ---------
                | o     o |
                | o     o |
                | o     o |
                 ---------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}