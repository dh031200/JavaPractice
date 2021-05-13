package Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyMovePanel extends JPanel {
    public static final int NUM = 10;
    private JButton[] list;
    private int index;

    public KeyMovePanel(){
        setLayout(new GridLayout(0,NUM));
        list = new JButton[NUM*NUM];
        for (int i =0; i<list.length; i++){
            list[i] = new JButton();
            list[i].setBackground(Color.white);
            list[i].setEnabled(false);
            add(list[i]);
        }

        index = (int) (Math.random() * (NUM * NUM));
        list[index].setBackground(Color.blue);

        this.setFocusable(true);
        this.requestFocus();

        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                list[index].setBackground(Color.white);
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        if(index<NUM)
                            index += NUM * NUM;
                        index -= NUM;
                        break;

                    case KeyEvent.VK_DOWN:
                        index =(index + NUM) % (NUM * NUM);
                        break;
                    case KeyEvent.VK_RIGHT:
                        index++;
                        if(index % NUM == 0)
                            index -= NUM;
                        break;
                    case KeyEvent.VK_LEFT:
                        if(index % NUM == 0)
                            index += NUM;
                        index--;
                        break;
                }
                list[index].setBackground(Color.blue);
            }
        });
    }
}
