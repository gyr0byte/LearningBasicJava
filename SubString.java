import java.util.Scanner;

public class SubString {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you email :");
        String email = sc.next();
        // String username = email.substring(0,8);
        // String domain = email.substring(9,18);
        // String domain = email.substring(9);
        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Email must contain @ ");
        }
        sc.close();
    }
}