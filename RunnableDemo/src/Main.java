public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email") {
            @Override
            public void run() {
                System.out.println("Running thread 2");
            }

            @Override
            public void start() {
                System.out.println("aaaa");
                run();
            }
        };
        runnableDemo2.start();

        System.out.println("Main thread stopped");
    }
}
