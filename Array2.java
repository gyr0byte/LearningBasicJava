import java.util.Arrays;
public class Array2 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Coconut"};
        /* fruits[0] = "PineApple";
        int numOfArrays = fruits.length;
        System.out.println(fruits[0]);
        System.out.println(numOfArrays);
        Arrays.fill(fruits, "PineApple"); will fill array with PineApple */
        Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}