
import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();
        while (age < 0) { 
            System.out.println("Age can't be negative");
            System.out.println("Enter your age");
            age = sc.nextInt();
        }
        System.out.println("You are " + age + " years old.");
        sc.close();
    }
}
