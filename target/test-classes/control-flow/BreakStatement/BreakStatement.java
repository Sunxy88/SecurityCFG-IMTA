import java.util.Random;

public class BreakStatement {
    public void whileStatement() {
        int count = new Random().nextInt();
        int d;

        while (count-- > 0) {
            d = new Random().nextInt();
            if (d % 3 == 0)
                break;
        }

        System.out.println("Test finished");
    }
}