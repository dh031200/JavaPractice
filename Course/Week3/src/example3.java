import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.print("x, y = ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("> x = " + x + ", y = " + y);
        System.out.println("> x + y = " + x + " + " + y + " = " + (x+y));

        int result = x + y;
        System.out.println("> x + y = result = " + result);

        String name;
        System.out.print("이름을 입력하세요: ");
        name = scanner.next();

        System.out.println("이름은 " + name + " 입니다. ");
    }
}
