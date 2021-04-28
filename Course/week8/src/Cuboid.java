public class Cuboid extends Rectangle {
    private int depth;

    public Cuboid(int x, int y, int width, int height, int depth) {
        super(x, y, width, height);
        this.depth = depth;
        System.out.println("직육면체 생성");
    }

    public void printShape() {
        super.printShape();
        System.out.println("depth: " + this.depth);
    }

    public double getArea() {
        return (2 * width * height) + (2 * width * depth) + (2 * height * depth);
    }

    public double getVolume() {
        return width * height * depth;
    }
}
