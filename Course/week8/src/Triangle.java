public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height * 0.5;
    }

    public void printShape() {
        super.printShape();
        System.out.println("base: " + this.base + ", height: " + this.height);
    }
}
