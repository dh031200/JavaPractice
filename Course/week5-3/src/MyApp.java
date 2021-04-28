public class MyApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int a = 10;
        int b = 20;

        double dA = 2.8;
        double dB = 1.4;

        String sA = "hello";
        String sB = "world";

        System.out.println("int > " + cal.add(a,b));
        System.out.println("int > " + cal.add(dA,dB));
        System.out.println("int > " + cal.add(sA,sB));
        System.out.println("int > " + cal.sub(a,b));
        System.out.println("int > " + cal.sub(dA,dB));
        System.out.println("int > " + cal.sub(sA,sB));
    }
}