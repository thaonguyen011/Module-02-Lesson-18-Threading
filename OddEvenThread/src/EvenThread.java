public class EvenThread extends Thread{
    public void run() {
        try {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
