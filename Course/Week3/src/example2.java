public class example2 {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        int x = 3;
        int y = 4;

        System.out.println("> x = " + x + ", y= " + y);
        System.out.println("> x + y = " + x + " + "  + y  + " = " + (x + y));

        int result = x + y;
        System.out.println("> x + y =  result = " + result);

        result =  result + 10;
        System.out.println("\n> result + 10 = " + result);

        result += 10;
        System.out.println("> result + 10 = " + result);

        int xPlus = x++;
        System.out.println("\n> 후위증가 : x = " + x + ", xPlus = " + xPlus);

        xPlus = ++x;
        System.out.println("> 전위증가 : x = " + x + ", xPlus = " + xPlus);

        boolean z = (x >= y);
        System.out.println("\n> x =  " + x + ", y =  " + y);
        System.out.println("> x가 y보다 크고나 같은가? " + z);
    }
}
