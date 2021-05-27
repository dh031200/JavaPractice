package Dice;

import Constants.Constants;

import javax.swing.*;
import java.awt.*;

public class Dice {
    private int x;
    private int y;
    private Image[] images;
    private int currentNum;

    public Dice(int x, int y, int currentNum) {
        this.x = x;
        this.y = y;
        this.currentNum = currentNum;
        images = new Image[Constants.DICE_SIZE];
        for(int i=0;i<Constants.DICE_SIZE; i++){
            images[i] = new ImageIcon(Constants.DIR_RESOURCE + Constants.DIR_DICE + "DICE"+(i+1)+".png").getImage();
        }
    }

    public void draw(Graphics g) {
        g.drawImage(images[currentNum-1],x,y,Constants.DICE_WIDTH,Constants.DICE_HEIGHT,null);
    }
}
