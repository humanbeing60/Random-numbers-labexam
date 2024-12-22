import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println(1000 + random.nextInt(9000));
        }
    }
}