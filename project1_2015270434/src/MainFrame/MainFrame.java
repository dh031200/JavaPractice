package MainFrame;

import Constants.Constants;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainPanel mainPanel;
    private Thread thread;      // 애니메이션 구현 (하려다가 보류)

    public MainFrame() {
        this.mainPanel = new MainPanel();
        this.add(this.mainPanel);
    }

    public void init() {
        // 초기설정
        this.setSize(Constants.MAINFRAME_WIDTH, Constants.MAINFRAME_HEIGHT);
        this.setTitle(Constants.MAINFRAME_TITLE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
