public class Sphere extends Circle {
    public Sphere(int x, int y, int radius) {
        super(x, y, radius);
        System.out.println("구 생성");
    }

    public double getArea() {
        return 4 * Math.pow(radius, 2) * Math.PI;
    }

    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
