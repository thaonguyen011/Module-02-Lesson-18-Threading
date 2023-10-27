
public class Main {
    public static void main(String[] args) {
       Thread thread1 = new Thread(new NumberGenerator("thread1"));
       Thread thread2 = new Thread(new NumberGenerator("thread2"));

       thread1.setPriority(Thread.MIN_PRIORITY);
       thread2.setPriority(Thread.MAX_PRIORITY);
       thread1.start();
       thread2.start();
    }
}