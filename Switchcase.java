import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random day in a week");
        String day = sc.nextLine();
        switch (day)
        {
            case "Monday":
                System.out.println("The day is Monday");
                break;
            case "Tuesday":
                System.out.println("The day is Tuesday");
                break;
            case "Wednesday":
                System.out.println("The day is Wednesday");
                break;
            case "Thursday":
                System.out.println("The day is Thursday");
                break;
            case "Friday":
                System.out.println("The day is Friday");
                break;
            case "Saturday":
                System.out.println("The day is Saturday");
                break;
            case "Sunday":
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        sc.close();
    }
}
