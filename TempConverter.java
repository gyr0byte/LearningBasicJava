import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp, newTemp;
        String unit;
        System.out.println("Enter the temperature :");
        temp = sc.nextDouble();
        System.out.println("Convert to celsius or fahrenheit (C or F) ?");
        unit = sc.next().toUpperCase();
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        System.out.printf("The temperature is %.2f°%s", newTemp, unit);
        sc.close();
    }
}