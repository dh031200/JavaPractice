package MainFrame;

import Board.BlueMarbleBoard;
import Constants.Constants;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public BlueMarbleBoard board;

    public MainPanel() {
        this.board = new BlueMarbleBoard();

        setLayout(new FlowLayout(FlowLayout.LEFT, 40, 20));
        // board의 멤버 변수(compuer, player)로 부터 잔액을 가져옴
        JLabel computer_Balance = new JLabel("컴퓨터 잔액: " + board.getComputer().getBalance());
        JButton roll_dice = new JButton("주사위 굴리기");
        JLabel player_Balance = new JLabel("플레이어 잔액: " + board.getPlayer().getBalance());
        computer_Balance.setFont(Constants.FONT_TYPE);
        roll_dice.setFont(Constants.FONT_TYPE);
        player_Balance.setFont(Constants.FONT_TYPE);
        add(computer_Balance);
        add(roll_dice);
        add(player_Balance);
    }

    protected void paintComponent(Graphics g) {
        //시스템에서 직접호출 하는 그리기 메소드
        //해당 패널이 들어간 프레임이 보여지면 해당 메소드가 호출됨
        super.paintComponent(g);
        if (this.board != null) {
            this.board.drawBoard(g);
            this.board.drawAgent(g);
            this.board.drawDice(g);
        }
    }
}
