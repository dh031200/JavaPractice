public class CountingThread implements Runnable {
    private Number number;
    private int threadId;

    public CountingThread(Number number, int id) {
        this.number = number;
        this.threadId = id;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (number) {
                int cnt = number.getNum();
                number.setNum(++cnt);
            }
            System.out.println("thread " + threadId + " count: " + number.getNum());
        }
    }
}
