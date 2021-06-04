package MainFrame;

import Agent.*;
import Board.BlueMarbleBoard;
import City.*;
import Constants.Constants;
import Board.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    public BlueMarbleBoard board;
    public JLabel computer_Balance;
    public JLabel player_Balance;

    public MainPanel() {
        this.board = new BlueMarbleBoard();

//        this.setLayout(Layout);
        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        // board의 멤버 변수(compuer, player)로 부터 잔액을 가져옴
        this.computer_Balance = new JLabel("컴퓨터 잔액: " + board.getComputer().getBalance());
        JButton roll_dice = new JButton("주사위 굴리기");
        this.player_Balance = new JLabel("플레이어 잔액: " + board.getPlayer().getBalance());
        computer_Balance.setFont(Constants.FONT_TYPE);
        roll_dice.setFont(Constants.FONT_TYPE);
        roll_dice.addActionListener(new ButtonListener());  //ActionListener 추가
        player_Balance.setFont(Constants.FONT_TYPE);
        add(computer_Balance);
        add(roll_dice);
        add(player_Balance);
    }

    protected void paintComponent(Graphics g) {
        // 시스템에서 직접호출 하는 그리기 메소드
        // 해당 패널이 들어간 프레임이 보여지면 해당 메소드가 호출됨
        super.paintComponent(g);
        if (this.board != null) {
            this.board.drawBoard(g);
            this.board.drawAgent(g);
            this.board.drawDice(g);
        }
    }

    public void moveAgent(int diceNum, boolean turn) {
        // agent에 따라 이동 최소, 최대 범위를 조정하기 위한 멤버변수
        int minX;
        int minY;
        int maxX;
        int maxY;
        int goTile = diceNum * Constants.TILE_WIDTH;    // 주사위 눈 * 타일 너비 만큼 이동시키면 됨.
        Agent agent;

        if (turn) {     // 에이전트 판별
            agent = board.getPlayer();
            minX = Constants.PLAYER_X;
            minY = Constants.PLAYER_Y;
        } else {
            agent = board.getComputer();
            minX = Constants.COMPUTER_X;
            minY = Constants.COMPUTER_Y;
        }
        int roundGold = agent.getTile()+diceNum;        // 타일 번호를 불러오고 한바퀴 돌았을 시 잔액 20만원 추가
        if (roundGold > 23)
            agent.setBalance(agent.getBalance()+200000);
        agent.setTile((agent.getTile() + diceNum) % 24);

        maxX = minX + (Constants.BOARD_WIDTH - 1) * Constants.TILE_WIDTH;
        maxY = minY + (Constants.BOARD_HEIGHT - 1) * Constants.TILE_HEIGHT;
        while (goTile > 0) {    // Agent가 타일을 이동하는 코드, 이부분에 이동하는 값과 sleep을 이용하여 애니메이션 처럼 하려했으나 잘 안됐음.
            if (agent.getY() == minY && agent.getX() < maxX)
                agent.setX(agent.getX() + Constants.TILE_WIDTH);
            else if (agent.getX() == maxX && agent.getY() < maxY)
                agent.setY(agent.getY() + Constants.TILE_HEIGHT);
            else if (agent.getY() == maxY && agent.getX() > minX)
                agent.setX(agent.getX() - Constants.TILE_WIDTH);
            else if (agent.getX() == minX && agent.getY() > minY)
                agent.setY(agent.getY() - Constants.TILE_HEIGHT);
            goTile -= Constants.TILE_HEIGHT;
        }
        repaint();

    }

    public void business(int diceNum, boolean turn) {
        // 사용할 변수 정의
        Agent agent;
        Tile tile;
        int probOfPurchase;
        JLabel jlabel;
        Constants.TILE_TYPE tileType;
        Constants.CITY_STATE cityState;
        // agent 판별 및 변수 초기화
        if (turn) {
            agent = board.getPlayer();
            probOfPurchase = 10;
            tileType = Constants.TILE_TYPE.player;
            cityState = Constants.CITY_STATE.owned_by_player;
            jlabel = player_Balance;
        } else {
            agent = board.getComputer();
            probOfPurchase = (int)(Math.random()*10) + 1;
            tileType = Constants.TILE_TYPE.computer;
            cityState = Constants.CITY_STATE.owned_by_computer;
            jlabel = computer_Balance;
        }
        // 타일 번호에 따라 타일 판별 후 빈 도시일 경우 컴퓨터는 50%, 플레이어는 100% 확률로 타일을 구매함.
//        System.out.println(agent.getTile()); //타일 번호 확인용
        tile = board.getTileMap(Constants.TILE_SEQ[agent.getTile()][0], Constants.TILE_SEQ[agent.getTile()][1]);
//        System.out.println(tile.getCity().getCityState());  // cityState 확인용
        if (tile.getTileType() == Constants.TILE_TYPE.free) {
        if(probOfPurchase > 5) {    // 랜덤 난수가 5보다 클경우 (플레이어는 무조건 10) (컴퓨터는 1 ~ 10)
                if(agent.getBalance() >= Constants.CITY_COST) { // 잔액이 부족한 경우 타일 구매 안함.
                    tile.setTileType(tileType);
                    City city = tile.getCity();
                    city.setCityState(cityState);
                    agent.setBalance(agent.getBalance() - 200000);
                }
            }
        }
        repaint();  // 구매 후 repaint 및 잔액 새로고침
        jlabel.setText(agent.getBalance()+"");
    }

    private class ButtonListener implements ActionListener {
        // 버튼을 누를 시 BlueMarble의 roll_dice 실행하고 moveAgent와 business 실행
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            int diceNum = board.roll_Dice();
            boolean turn = board.getTurn();
            moveAgent(diceNum, turn);
            business(diceNum, turn);

        }
    }
}
