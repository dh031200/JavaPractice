public class MyApp {
    public static void main(String[] args) {
//        Thread thread1 = new MyThread(1);
//        Thread thread2 = new MyThread(2);
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
