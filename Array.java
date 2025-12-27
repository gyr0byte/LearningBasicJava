public class Array {
    public static void main(String[] args) {
        int nums[]= {10, 20, 30, 40, 50};
        for (int i : nums) {
            System.out.println(i);
        }
        int sum = 0;
        for (int x : nums){
            sum = sum +x;
        }
        System.out.println("The sum of array is "+sum);
    }
}
