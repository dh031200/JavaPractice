import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox2 extends JFrame {
    private JCheckBox red, green, blue;
    private JLabel message;

    public CheckBox2() {
        setSize(300, 300);
        setTitle("CheckBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        red = new JCheckBox("Red");
        green = new JCheckBox("Green");
        blue = new JCheckBox("Blue");

        red.setBorderPainted(true);
        green.setBorderPainted(true);
        blue.setBorderPainted(true);

        // Check box listener
        CheckBoxListener listener = new CheckBoxListener();
        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        message = new JLabel("", SwingConstants.CENTER);

        JPanel panel = new JPanel();
        panel.add(red);
        panel.add(green);
        panel.add(blue);
        Container cPane = getContentPane();
        cPane.setLayout(new BorderLayout());
        cPane.add(panel, "North");
        cPane.add(message, "South");
    }

    public void paint(Graphics g){
        super.paint(g);

        int rCheck= red.isSelected() ? 1:0;
        int gCheck= green.isSelected() ? 1:0;
        int bCheck= blue.isSelected() ? 1:0;
        Color color= new Color(rCheck*255,gCheck*255,bCheck*255);
        g.setColor(color);
        g.fillOval(50,75,200,200);
    }

    private class CheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            // If checked, or not
            String item = ((JCheckBox) e.getItem()).getText();
            if (e.getStateChange() == ItemEvent.SELECTED)
                message.setText(item + " selected");
            else
                message.setText(item + " deselected");

            repaint();
        }
    }
}
