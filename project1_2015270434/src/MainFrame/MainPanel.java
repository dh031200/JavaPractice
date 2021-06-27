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
    public JLabel computer_info;
    public JLabel player_info;
    public JButton roll_dice;

    public MainPanel() {
        this.board = new BlueMarbleBoard();

        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        // board의 멤버 변수(compuer, player)로 부터 잔액을 가져옴
        this.computer_info = new JLabel("컴퓨터 잔액: " + board.getComputer().getBalance());
        roll_dice = new JButton("주사위 굴리기");
        this.player_info = new JLabel("플레이어 잔액: " + board.getPlayer().getBalance());
        computer_info.setFont(Constants.FONT_TYPE);
        roll_dice.setFont(Constants.FONT_TYPE);
        roll_dice.addActionListener(new ButtonListener());  //ActionListener 추가
        player_info.setFont(Constants.FONT_TYPE);
        add(computer_info);
        add(roll_dice);
        add(player_info);
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
        int roundGold = agent.getTile() + diceNum;        // 타일 번호를 불러오고 한바퀴 돌았을 시 잔액 20만원 추가
        if (roundGold > 23)
            agent.setBalance(agent.getBalance() + 200000);
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

    public void business(boolean turn) {
        // 사용할 변수 정의
        Agent agent;
        Agent enemy;
        Tile tile;
        int probOfPurchase;
        Constants.TILE_TYPE tileType;
        Constants.CITY_STATE cityState;
        Constants.CITY_STATE enemy_tile;

        // agent 판별 및 변수 초기화
        if (turn) {
            agent = board.getPlayer();
            enemy = board.getComputer();
            probOfPurchase = 10;
            tileType = Constants.TILE_TYPE.player;
            cityState = Constants.CITY_STATE.owned_by_player;
            enemy_tile = Constants.CITY_STATE.owned_by_computer;
        } else {
            agent = board.getComputer();
            enemy = board.getPlayer();
            probOfPurchase = (int) (Math.random() * 10) + 1;
            tileType = Constants.TILE_TYPE.computer;
            cityState = Constants.CITY_STATE.owned_by_computer;
            enemy_tile = Constants.CITY_STATE.owned_by_player;
        }
        // 타일 번호에 따라 타일 판별 후 빈 도시일 경우 컴퓨터는 50%, 플레이어는 100% 확률로 타일을 구매함.
//        System.out.println(agent.getTile()); //타일 번호 확인용
        tile = board.getTileMap(Constants.TILE_SEQ[agent.getTile()][0], Constants.TILE_SEQ[agent.getTile()][1]);
//        System.out.println(tile.getCity().getCityState());  // cityState 확인용
        if (tile.getTileType() == Constants.TILE_TYPE.free) {
            if (probOfPurchase > 5) {    // 랜덤 난수가 5보다 클경우 (플레이어는 무조건 10) (컴퓨터는 1 ~ 10)
                if (agent.getBalance() >= Constants.CITY_COST) { // 잔액이 부족한 경우 타일 구매 안함.
                    tile.setTileType(tileType);
                    City city = tile.getCity();
                    city.setCityState(cityState);
                    agent.setBalance(agent.getBalance() - 200000);
                }
            }
        } else if (tile.getTileType() == Constants.TILE_TYPE.island) {      // 도착 도시가 무인도면 agent의 island를 true로
            agent.setIsland(true);
        } else if (tile.getCity().getCityState() == enemy_tile) {           // 도착 도시가 상대방 타일일 경우 내 잔액에서 상대에게 10만원을 줌
            agent.setBalance(agent.getBalance() - 100000);
            enemy.setBalance(enemy.getBalance() + 100000);
        }
        computer_info.setText("컴퓨터 잔액: " + board.getComputer().getBalance());
        player_info.setText("플레이어 잔액: " + board.getPlayer().getBalance());
        repaint();  // 구매 후 repaint 및 잔액 새로고침
    }

    private class ButtonListener implements ActionListener {
        // 버튼을 누를 시 BlueMarble의 roll_dice 실행하고 moveAgent와 business 실행
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            int diceNum = board.roll_Dice();
            boolean turn = board.getTurn();
            Agent agent;
            moveAgent(diceNum, turn);
            business(turn);

            while (true) {      // 상대가 무인도에 있을시 턴 넘김    무인도-무인도의 경우 해결을 위해
                if (!turn)      //                               상대방이 무인도에 없을 때 까지 반복
                    agent = board.getPlayer();
                else
                    agent = board.getComputer();
                if (agent.isIsland()) {             // 현재 주사위 굴린 agent 기준 상대가 무인도에 있는지 체크
                    turn = !turn;           // 턴넘기기
                    board.setTurn(turn);    // 보드의 턴 세팅
                    agent.setIsland(false);     // 무인도 탈출
                } else
                    break;
            }
            if (board.checkEnd()) {     // 게임 끝났는지 여부 확인
                roll_dice.setEnabled(false);        // 주사위 던지기 비활성화
                roll_dice.setText("게임 종료");
                int count_C = 0;
                int count_P = 0;
                for (City city : board.getCityList()) {     // 모든 도시를 돌며 소유권 확인 후 개수 카운트
                    if (city.getCityState() == Constants.CITY_STATE.owned_by_player)
                        count_P += 1;
                    else if (city.getCityState() == Constants.CITY_STATE.owned_by_computer)
                        count_C += 1;
                }
                count_P = count_P * 100000 + board.getPlayer().getBalance();        // 소유 도시 개수 * 100000 + 현재 잔액
                count_C = count_C * 100000 + board.getComputer().getBalance();
                player_info.setText("플레이어 결과: " + count_P);
                computer_info.setText("컴퓨터 결과: " + count_C);
                computer_info.setForeground(Color.RED);     // 컴퓨터와 플레이어 글씨 빨갛게 바꿈
                player_info.setForeground(Color.RED);
                if (count_P > count_C) {            // 결과 점수가 더 낮은 플레이어 색상을 파랗게
                    computer_info.setForeground(Color.BLUE);
                } else if (count_C > count_P)
                    player_info.setForeground(Color.BLUE);
                computer_info.setFont(Constants.END_FONT);      // 볼드 적용
                player_info.setFont(Constants.END_FONT);

            }
        }
    }
}
