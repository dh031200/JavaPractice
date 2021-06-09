public class CountingThread implements Runnable {
    private int threadId;

    public CountingThread(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        for (int i = 1; i <= 7; i++) {
            System.out.println(threadId + "번 쓰레드: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadId + "번 쓰레드 업무 종료");
    }
}
