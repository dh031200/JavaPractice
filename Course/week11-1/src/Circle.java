import java.awt.*;

public class Circle extends Shape {
    protected int radius;

    public Circle(int x, int y, int radius) {
        System.out.println("원 생성");
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.drawOval(x,y,2*radius,2*radius);
        System.out.println("원 그리기");
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printShape() {
        super.printShape();
        System.out.println("radius: " + this.radius);
    }
}
