import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(int x, int y, int width, int height) {
        System.out.println("사각형 생성");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.drawRect(x,y,width,height);
        System.out.println("사각형 그리기");
    }

    public void draw(String color) {
        System.out.println("사각형 그리기");
        System.out.println(color + "로 그림!");
    }

    public double getArea() {
        return width * height;
    }

    public void printShape() {
        super.printShape();
        System.out.println("width: " + this.width + ", height: " + this.height);
    }
}
