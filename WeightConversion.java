import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, newweight;
        int choice;
        System.out.println("Weight Conversion Program");
        System.out.println("Press 1: Convert lbs into kgs");
        System.out.println("Press 2: Convert kgs into lbs");
        System.out.print("Choose an Option :");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter the weight in lbs :");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("Your weight is %.2fKGs", newweight);
        } else if (choice == 2) {
            System.out.println("Enter the weight in kgs :");
            weight = sc.nextDouble();
            newweight = weight * 2.20562;
            System.out.printf("Your weight is %.2flbs", newweight);
        } else {
            System.out.println("That was not a valid choice !!");
        }
        sc.close();
    }
}