import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame {
    private JCheckBox red, green, blue;

    public CheckBox() {
        setSize(300, 300);
        setTitle("CheckBox1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        red = new JCheckBox("Red");
        green = new JCheckBox("Green");
        blue = new JCheckBox("Blue");

        JButton button = new JButton("확인");
        ButtonListener buttonListener = new ButtonListener();
        button.addActionListener(buttonListener);

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(red);
        cPane.add(green);
        cPane.add(blue);
        cPane.add(button);
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

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
