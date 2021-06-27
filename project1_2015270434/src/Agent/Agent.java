package Agent;

import java.awt.*;

public abstract class Agent {
    protected int x;
    protected int y;
    protected Image image;
    protected int balance;
    protected int tile;
    protected boolean island;   // 무인도 판별을 위함

    public void draw(Graphics g) {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getTile() {
        return tile;
    }

    public void setTile(int tile) {
        this.tile = tile;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isIsland() {
        return island;
    }

    public void setIsland(boolean island) {
        this.island = island;
    }
}
