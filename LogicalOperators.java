import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you username:");
        String username = sc.next();
        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username shouldn't contain underscore or spaces");
        } else {
            System.out.println("WELCOME, " + username);
        }
        sc.close();
    }
}