import java.util.Arrays;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
//        byte b = 120;
//        short s = 23000;
//        int i = 10;
//        long l = 222_222_222_222l;
//
//        float f = 4.4f;
//        double d = 5.1;
//
//        char c = 'j';
//
//        boolean bool = false;
//
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//
//        System.out.println(f);
//        System.out.println(d);
//
//        System.out.println(c);
//
//        System.out.println(bool);
//        int x = 3;
//        int y = 4;
//
//        System.out.println("> x = " + x + ", y= " + y);
//        System.out.println("> x + y = " + (x + y));
//
//        int result = x + y;
//        System.out.println("> result = " + result);
//
//        result += 10;
//        System.out.println("> result = " + result);
//
//        result += 10;
//        System.out.println("> result = " + result);
//
//        int xPlus = x++;
//        System.out.println("> 후위증가 : x = " + x + ", xPlus = " + xPlus);
//
//        xPlus = ++x;
//        System.out.println("> 후위증가 : x = " + x + ", xPlus = " + xPlus);
//
//        boolean z = (x>=y);
//        System.out.println("> x가 y보다 크고나 같은가? " + z);
//        int x;
//        int y;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("x, y = ");
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//
//        System.out.println("> x = " + x + ", y = " + y);
//
//        String name;
//        System.out.println("이름을 입력하세요: ");
//        name = scanner.next();
//
//        System.out.println("이름은 " + name + "입니다. ");
//        Scanner scanner = new Scanner(System.in);
//        String input;
//
//        System.out.print("> ");
//        input = scanner.nextLine();
//        System.out.println(input);
//
//        System.out.print("> ");
//        input = scanner.next();
//        System.out.println(input);
/*        String str = "Hello World!";
        System.out.println(str);

        System.out.println("Lower case: " + str.toLowerCase());
        System.out.println("Upper case: " + str.toUpperCase());

        str = "hello java programming";
        System.out.println("str length: " + str.length());

        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,8));

        System.out.println(str.equals("hello java programming"));

        int index = str.indexOf("java");
        System.out.println("\"java\" in str : " + index);
        System.out.println("\"ddd\" in str : " + str.indexOf("ddd"));

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("> ");
        input = scanner.nextLine();
        System.out.println(str.equals(input.trim()));*/
        int a = 0x55ff;
        short b = (short)a;
        short c = 0x55ff;
        short d = (short)0x55ff;

        System.out.printf("%x\n",a);
        System.out.printf("%x\n",b);
        System.out.printf("%x\n",c);
        System.out.printf("%x\n",d);

    }
}
