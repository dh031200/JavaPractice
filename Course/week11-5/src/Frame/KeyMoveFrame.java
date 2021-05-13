package Frame;

import Panel.KeyMovePanel;

import javax.swing.*;

public class KeyMoveFrame  extends JFrame {
    public KeyMoveFrame(){
        setSize(400,400);
        setTitle("Key Move");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new KeyMovePanel());
    }
}
