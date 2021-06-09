public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        CountingThread c1 = new CountingThread(1);
        CountingThread c2 = new CountingThread(2);
        Thread thread1 = new Thread(c1);
        Thread thread2 = new Thread(c2);

        thread1.start();
        thread2.start();
    }
}
