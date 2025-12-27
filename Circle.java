import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, circumference, area, volume;
        System.out.println("Enter the radius of the circle:");
        radius = sc.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.printf("The circumference of the circle is %.2fcm\n",circumference);
        System.out.printf("The area of circle is %.2fcm²\n", area);
        System.out.printf("The volume of the circle is %.2fcm³\n", volume);
        System.out.println(Math.PI);
        sc.close();
    }
}