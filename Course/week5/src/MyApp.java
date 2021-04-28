import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("i, j = ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        System.out.println("i와 j의 차이 " + Math.abs(i-j));
        System.out.println("max = " + Math.max(i,j));
        System.out.println("min = " + Math.min(i,j));
*/
        System.out.println("1. random value = " + Math.random());
        System.out.println("2. random value = "+ Math.random());
        System.out.println("3. random value = "+ Math.random());

        double r = Math.random();
        System.out.println(r);
        r*=10;
        System.out.println(r);
        System.out.println((int)r+1);

        System.out.println((int)Math.random()*10 + 1);
/*        Int a = new Int(10);
        Int b = new Int(20);

        System.out.println("a = " + a.getI() + ", b = " + b.getI());

        swapInt(a, b);
        System.out.println("a = " + a.getI() + ", b = " + b.getI());*/
    }

/*    private static void swapInt(Int a, Int b) {
        System.out.print("swap");
        int temp = a.getI();
        a.setI(b.getI());
        b.setI(temp);
    }*/

///    public static void swapPrinitive(int a, int b){
//        System.out.println("swap - ");
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }
//    public static void swapReference(Integer a, Integer b){
//        System.out.println("swap - ");
//        Integer tmp = a;
//        a = b;
//        b = tmp;
//    }
}
