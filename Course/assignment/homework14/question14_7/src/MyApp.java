public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        SharedItem item = new SharedItem();
        Thread t1 = new Thread(new Producer(item));
        Thread t2 = new Thread(new Consumer(item));

        t1.start();
        t2.start();
    }
}
