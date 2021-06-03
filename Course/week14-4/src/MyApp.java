public class MyApp {
    public static void main(String[] args) {
        SharedItem si = new SharedItem();
        Thread t1 = new Thread(new Producer(si));
        Thread t2 = new Thread(new Consumer(si));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
