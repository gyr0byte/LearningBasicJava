import java.util.Random;
public class randomgen {
    public static void main(String[] args) {
        Random rand = new Random();
        int num, num2, num3;
        num = rand.nextInt(1,101);
        num2 = rand.nextInt(1,101);
        num3 = rand.nextInt(1,101);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }
}
