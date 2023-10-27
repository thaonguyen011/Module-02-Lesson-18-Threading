
public class Main {
    public static void main(String[] args) {
       Thread primeList1 = new Thread(new LazyPrimeFactorization());
       Thread primeList2 = new Thread(new OptimizedPrimeFactorization());

       primeList1.start();
       primeList2.start();

    }
}