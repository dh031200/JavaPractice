import java.awt.*;

public class Shape {
    protected int x;
    protected int y;

    public Shape() {
        System.out.println("인자가 없는 Shape 생성자");
    }

    public void draw(Graphics g) {

    }

    public double getArea() {
        return -1;
    }

    public void printShape() {
        System.out.println("==========");
        System.out.println("x: " + this.x + ", y: " + this.y);
    }
}
