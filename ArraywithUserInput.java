import java.util.Scanner;

public class ArraywithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String[] foods; 
        int size;
        System.out.println("What number of foods you want to enter?");
        size = sc.nextInt();
        sc.nextLine();
        String[] foods = new String[size];
        for (int i = 0; i< foods.length;i++) {
            System.out.println("Enter a food:");
            foods[i] = sc.nextLine().trim();
        }
        System.out.println("**********");
        for (String food : foods) {
            System.out.println(food);
        }
        sc.close();
    }
}
