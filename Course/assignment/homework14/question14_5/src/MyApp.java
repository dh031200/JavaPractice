public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        Number number = new Number(0);
        System.out.println("start: " + number.getNum());
        Thread[] thread = new Thread[50];

        for (int i = 0; i < 50; i++) {
            thread[i] = new Thread(new CountingThread(number, i));
            thread[i].start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("result: " + number.getNum());
    }
}
