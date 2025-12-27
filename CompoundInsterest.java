import java.util.Scanner;
public class CompoundInsterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, amount;
        int timesCompounded, years;
        System.out.println("Enter the principal :");
        principal = sc.nextDouble();
        System.out.println("Enter the interest rate in (%)");
        rate = sc.nextDouble()/100;
        System.out.println("Enter the # of times compounded per year :");
        timesCompounded = sc.nextInt();
        System.out.println("Enter the # of years :");
        years = sc.nextInt();
        amount = principal * Math.pow(1+rate/timesCompounded, timesCompounded*years);
        System.out.printf("The amount after %d year is Rs %.2f ",years, amount);
        sc.close();
    }
}
