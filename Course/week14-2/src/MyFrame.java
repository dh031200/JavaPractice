import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JButton btnStart;
    private JButton btnReset;
    private JLabel labelCount;
    private Thread thread;

    public MyFrame() {
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Timer");

        btnStart = new JButton("Start");
        btnReset = new JButton("Reset");
        labelCount = new JLabel("10");

        setLayout(new FlowLayout());
        add(btnStart);
        add(btnReset);
        Font font = new Font("Serif", Font.BOLD, 100);
        labelCount.setFont(font);
        add(labelCount);

        btnStart.addActionListener(this);
        btnReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnStart) {
            if (thread == null || !thread.isAlive()) {
                thread = new Thread(new TimerThread(labelCount));
                thread.start();
            }
        } else if (e.getSource() == btnReset) {
            if (thread != null && thread.isAlive()) {
                thread.interrupt();
            }
        }
    }
}
