package Board;

import Agent.*;
import City.City;
import Constants.Constants;
import Dice.*;

import javax.swing.*;
import java.awt.*;

public class BlueMarbleBoard {
    private int width;
    private int height;
    private Tile[][] tileMap;
    private Agent computer;
    private Agent player;
    private Dice dice;
    private City[] cityList;

    public Computer getComputer() {
        // computer getter
        return (Computer)computer;
    }

    public Player getPlayer() {
        // player getter
        return (Player)player;
    }

    public BlueMarbleBoard() {
        // Agent 초기화 (위치, 잔액)
        computer = new Computer(Constants.COMPUTER_X, Constants.COMPUTER_Y, Constants.MAX_BALANCE);
        player = new Player(Constants.PLAYER_X, Constants.PLAYER_Y, Constants.MAX_BALANCE);

        // 주사위 초기화 (위치, 현재 숫자)
        dice = new Dice(Constants.DICE_X,Constants.DICE_Y,1);

        // 도시 초기화(도시 이름 -> Constants.CITIES에서 순차적으로, 상태 -> free)
        cityList = new City[Constants.CITY_SIZE];
        for(int i=0; i<Constants.CITY_SIZE; i++){
            cityList[i] = new City(Constants.CITIES[i],Constants.CITY_COST, Constants.CITY_STATE.free);
        }

        // 타일 초기화 (빈 타일은 null)
        int idx = 0;
        tileMap = new Tile[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];
        for(int i=0; i< tileMap.length; i++){
            tileMap[i] = new Tile[Constants.BOARD_HEIGHT];
            for (int j=0; j<tileMap[i].length; j++){
                tileMap[i][j] = new Tile(j * Constants.TILE_WIDTH,60 + (Constants.TILE_HEIGHT * i));
                if((i == 0 || i == Constants.BOARD_HEIGHT-1) && (j ==0 || j == Constants.BOARD_HEIGHT-1)){
                    if(j==0 && i==0) {
                        // 맨 첫 타일은 시작
                        tileMap[i][j].setTileType(Constants.TILE_TYPE.start);
                    }
                    else{
                        // 맨 첫 타일이 아닌 것중 꼭지점에 위치한 타일은 무인도
                        tileMap[i][j].setTileType(Constants.TILE_TYPE.island);
                    }
                }
                else if((j>0 && j<Constants.BOARD_HEIGHT-1) && (i>0 && i<Constants.BOARD_HEIGHT-1)) {
                    // 각 모서리에 해당하지 않으면 빈 타일
                    continue;
                }
                else
                    // 위의 조건 외엔 도시
                    tileMap[i][j].setTileType(Constants.TILE_TYPE.free);
                tileMap[i][j].setCity(cityList[idx++]);
            }
        }
        //멤버 변수 세팅 우선
    }

    public void drawBoard(Graphics g) {
        g.setFont(Constants.FONT_TYPE);
        // 각 이미지 불러오기
        Image start = new ImageIcon(Constants.DIR_RESOURCE+Constants.DIR_TILE+"START.png").getImage();
        Image city = new ImageIcon(Constants.DIR_RESOURCE+Constants.DIR_TILE+"CITY.png").getImage();
        Image island = new ImageIcon(Constants.DIR_RESOURCE+Constants.DIR_TILE+"ISLAND.png").getImage();
        Image tile = new ImageIcon(Constants.DIR_RESOURCE+Constants.DIR_TILE+"TILE.png").getImage();

        // TileType에 따라 tile draw
        for (Tile[] tiles : tileMap) {
            for (Tile t : tiles) {
                if (t.getTileType() == Constants.TILE_TYPE.none)
                    g.drawImage(tile, t.getX(), t.getY(), Constants.TILE_WIDTH, Constants.TILE_HEIGHT, null);
                else {
                    if (t.getTileType() == Constants.TILE_TYPE.start) {
                        g.drawImage(start, t.getX(), t.getY(), Constants.TILE_WIDTH, Constants.TILE_HEIGHT, null);
                    } else if (t.getTileType() == Constants.TILE_TYPE.free) {
                        g.drawImage(city, t.getX(), t.getY(), Constants.TILE_WIDTH, Constants.TILE_HEIGHT, null);
                    } else if (t.getTileType() == Constants.TILE_TYPE.island) {
                        g.drawImage(island, t.getX(), t.getY(), Constants.TILE_WIDTH, Constants.TILE_HEIGHT, null);
                    }
                    g.drawString(t.getCity().toString(), t.getX() + 25, t.getY() + 25);
                }
            }
        }
        //보드 (타일) 그리기 메소드
    }

    public void drawAgent(Graphics g) {
        player.draw(g);
        computer.draw(g);
        // 플레이어, 컴퓨터 말 그리기 메소드
    }

    public void drawDice(Graphics g) {
        dice.draw(g);
        // 주사위 그리기 메소드
    }
}
