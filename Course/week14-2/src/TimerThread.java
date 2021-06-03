import javax.swing.*;

public class TimerThread implements Runnable {
    public static final int MAX_COUNT = 10;
    private int count;
    private JLabel labelCount;

    public TimerThread(JLabel label) {
        this.count = MAX_COUNT;
        this.labelCount = label;
    }

    @Override
    public void run() {
        labelCount.setText(this.count + "");

        while (count > 0) {
            try {
                Thread.sleep(1000);
                labelCount.setText(--count + "");
            } catch (InterruptedException e) {
                this.count = MAX_COUNT;
                labelCount.setText(this.count + "");
            }
        }
        labelCount.setText("end");
    }
}
