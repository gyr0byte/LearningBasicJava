import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week");
        String day = sc.next();
        switch (day) {
           /*  case "Monday" -> System.out.println("It's a Weekday");
            case "Tuesday" -> System.out.println("It's a Weekday");
            case "Wednesday" -> System.out.println("It's a Weekday");
            case "Thursday" -> System.out.println("It's a Weekday");
            case "Friday" -> System.out.println("It's a Weekday"); */
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a Weekday!");
           // case "Saturday" -> System.out.println("It's a Weekend");
           // case "Sunday" -> System.out.println("It's a Weekend");
           case "Saturday", "Sunday" -> System.out.println("It's a Weekend!");
            default -> System.out.println("Invalid day!!");
        }
        sc.close();
    }
}