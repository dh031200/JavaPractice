public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        CountingRunnableThread c1 = new CountingRunnableThread(1);
        CountingRunnableThread c2 = new CountingRunnableThread(2);
        Thread thread1 = new Thread(c1);
        Thread thread2 = new Thread(c2);

        thread1.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread2 exit! program end");
    }
}
