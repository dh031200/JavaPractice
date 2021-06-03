import java.util.Random;

public class Consumer implements Runnable {
    private SharedItem item;

    public Consumer(SharedItem item) {
        this.item = item;
    }

    @Override
    public void run() {
        int data;
        do {
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data = item.get();
            System.out.println("아이템 " + data + " 소비");
        } while (data < 5);
    }
}
