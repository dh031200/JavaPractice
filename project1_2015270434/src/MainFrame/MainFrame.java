package MainFrame;

import Constants.Constants;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainPanel mainPanel;
    private Thread thread;

    public MainFrame() {
        this.mainPanel = new MainPanel();
        this.add(this.mainPanel);

    }

    public void init(){
        // 초기설정
        this.setSize(Constants.MAINFRAME_WIDTH, Constants.MAINFRAME_HEIGHT);
        this.setTitle(Constants.MAINFRAME_TITLE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
