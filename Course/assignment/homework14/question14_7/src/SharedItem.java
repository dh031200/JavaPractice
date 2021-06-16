public class SharedItem {
    private int item;
    private boolean isConsumed;

    public SharedItem() {
        isConsumed = false;
    }

    public synchronized void put(int item) {
        while (!isConsumed) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isConsumed = false;
        this.item = item;
        notify();
    }

    public synchronized int get() {
        while (isConsumed) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isConsumed = true;
        notify();
        return item;
    }
}
