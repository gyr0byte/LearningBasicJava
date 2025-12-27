public class varargs {
    public static void main(String[] args) {
        add(1,2,3,4);
        System.out.println("Average is: "+ average(1,4,2,4,6,8));
    }
    static void add(int... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum is: "+sum);
    }
    static double average(double... numbers){
        double sum = 0;
        if (numbers.length == 0) {
            return 0;
        }
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
