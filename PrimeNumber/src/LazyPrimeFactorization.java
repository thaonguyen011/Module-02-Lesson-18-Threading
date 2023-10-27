import java.util.ArrayList;
import java.util.Arrays;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {

        try {
            double start = System.currentTimeMillis();
            for (int i = 1; i < 30; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    double end = System.currentTimeMillis();

                    System.out.println("Prime list 1: " + i + " run at time " + start + " finish after " + (end - start));
                }
                Thread.sleep(100);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
