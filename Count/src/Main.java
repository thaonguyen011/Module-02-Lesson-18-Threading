// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while ( (count.getMyThread().isAlive())) {
                System.out.println("Main thread will be alive till the thread is live");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}