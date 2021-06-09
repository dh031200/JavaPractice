import javax.swing.*;

public class CountingThread implements Runnable {
    public static final int MAX_COUNT = 10;
    private int count;
    private JLabel labelCount;

    public CountingThread(JLabel label) {
        this.count = MAX_COUNT;
        this.labelCount = label;
    }

    public void run() {
        labelCount.setText(this.count + "");
        while(count >0){
            try{
                Thread.sleep(1000);
                labelCount.setText(--count+"");
            } catch (InterruptedException e){
                this.count = MAX_COUNT;
                labelCount.setText(this.count+"");
            }
        }
        labelCount.setText("end");
    }
}
