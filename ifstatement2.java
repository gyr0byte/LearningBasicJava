import java.util.Scanner;
public class ifstatement2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter your name, please");
    String name = sc.nextLine();
    if (name.isEmpty()) {
        System.out.println("You did not enter a name");
    } else if (name.length() < 3) {
        System.out.println("Name is too short");
    } else {
        System.out.println("Hello, " + name + "!");
    }
    sc.close();
    }
}
