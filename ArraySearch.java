import java.util.Scanner;
public class ArraySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = { 1, 4, 7, 2, 9, 8, 5 };
        System.out.println("Enter a number to search for");
        int target = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < num.length; i++) {
            if (target == num[i]) {
                System.out.println("Number found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array");
        }
        fruits();
    }

    static void fruits() {
        String[] fruit = { "Apple", "Banana", "Mango", "Orange", "Pineapple" };
        System.out.println("Enter a fruit to search for:");
        String target = sc.next();
        boolean isFound = false;
        for (int i = 0; i < fruit.length; i++) {
            if (target.equalsIgnoreCase(fruit[i])) {
                System.out.println("Fruit found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array");
        }
    }
}