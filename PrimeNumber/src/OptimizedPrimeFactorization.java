import java.util.ArrayList;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {

try {
    double start = System.currentTimeMillis();
    for (int i = 2; i < 30; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            double end = System.currentTimeMillis();

            System.out.println("Prime list 2: " + i + " run at time " + start + " finish after " + (end - start));
        }
        Thread.sleep(100);
    }
} catch (Exception e) {
    System.out.println(e.getMessage());
}


    }
}
