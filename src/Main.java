import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(countTries(5));
        }
    }

    private static int countTries(int i) throws InterruptedException {
        int count = 0;
        boolean isFound = false;
        Thread.sleep(1);
        Random random = new Random(System.currentTimeMillis());
        while (!isFound) {
            if (random.nextInt(100) != i) {
                count = count + 1;
            } else {
                isFound = true;
            }
        }
        return count;
    }
}
