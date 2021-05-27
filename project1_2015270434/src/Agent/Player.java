package Agent;

import Constants.Constants;

import javax.swing.*;
import java.awt.*;

public class Player extends Agent {
    public Player(int x, int y, int balance) {
        this.x = x;
        this.y = y;
        this.balance = balance;
        // 이미지 불러오기
        this.image = new ImageIcon(Constants.DIR_RESOURCE + Constants.DIR_AGENT+"PLAYER.png").getImage();
    }

    public int getBalance(){
        // 잔액 반환
        return this.balance;
    }
    public void draw(Graphics g){
        // player image draw
        g.drawImage(image,x,y,Constants.AGENT_WIDTH,Constants.AGENT_HEIGHT,null);
    }
}
