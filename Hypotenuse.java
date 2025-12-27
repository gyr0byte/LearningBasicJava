import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,hypo;
        System.out.println("Enter the length of side A :");
        a = sc.nextDouble();
        System.out.println("Enter the length of side B :");
        b = sc.nextDouble();
        hypo = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.printf("The hypotenuse is : %.2f ", hypo, "cm");
        sc.close();
    }
}