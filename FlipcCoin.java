import java.util.Random;
public class FlipcCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        Boolean coin;
        coin = rand.nextBoolean();
        if (coin) {
            System.out.println("HEADS");
        }
        else{
            System.out.println("Tails");
        }
    }
}