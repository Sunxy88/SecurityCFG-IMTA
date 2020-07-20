import java.util.Random;

public class IfStatement {
    public void ifStatement() {
        int a = new Random().nextInt();
        if ((a & 2) == 1) {
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
        System.out.println("Test finished");
    }
}