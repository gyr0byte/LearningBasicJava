import java.util.Scanner;
public class DoWhileLoop2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do { 
            System.out.println("Enter a number between 1 to 10");
            num = sc.nextInt();
        } while (num < 1 || num > 10);
        System.out.println("You entered: " + num);
        sc.close();
    }
}