import java.util.Random;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("학번: 2015270434 이름: 김동훈");
        Random random = new Random();
        int rand1 = random.nextInt(10) + 1;
        int rand2 = random.nextInt(10) + 1;

        Shape shape = new Shape();
        printShapeInformation(shape);
        shape = new Rectangle(0, 0, rand1, rand2);
        printShapeInformation(shape);
        shape = new Circle(0, 0, rand2);
        printShapeInformation(shape);
        shape = new Cuboid(0, 0, rand1, rand2, 10);
        printShapeInformation(shape);
        shape = new Sphere(0, 0, rand2);
        printShapeInformation(shape);
        shape = new Triangle(0, 0, rand1, rand2);
        printShapeInformation(shape);
        shape = new Cylinder(0, 0, rand1, rand2);
        printShapeInformation(shape);
    }

    public static void printShapeInformation(Shape shape) {
        //shape 정보 출력
        shape.printShape();
        //Area 출력 "클래스 이름: 넓이"
        System.out.println(shape.getClass().getName() + " 넓이 : " + String.format("%.2f", shape.getArea()));

        if (shape instanceof Cuboid) {
            Cuboid cuboid = (Cuboid) shape;
            System.out.println(cuboid.getClass().getName() + " 부피: " + String.format("%.2f", ((Cuboid) shape).getVolume()) + "\n");
        }
        if (shape instanceof Sphere) {
            Sphere sphere = (Sphere) shape;
            System.out.println(sphere.getClass().getName() + " 부피: " + String.format("%.2f", sphere.getVolume()) + "\n");
        }
        if (shape instanceof Cylinder) {
            Cylinder cylinder = (Cylinder) shape;
            System.out.println(cylinder.getClass().getName() + " 부피: " + String.format("%.2f", cylinder.getVolume()) + "\n");
        }
        System.out.println();
    }
}
