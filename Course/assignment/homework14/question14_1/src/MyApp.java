public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 κΉλν");
        Thread thread1 = new CountingThread(1);
        Thread thread2 = new CountingThread(2);

        thread1.start();
        thread2.start();
    }
}
