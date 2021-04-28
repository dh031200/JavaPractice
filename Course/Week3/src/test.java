import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char e = scanner.next().charAt(0);

        for (char i = 'a'; i <= e; i++) {
            for (char j = 'a'; j <= 'a'+(e-i); j++)
                System.out.print(j + " ");
            System.out.println("");
        }
/*        System.out.print("1~99 사이의 정수를 입력하시오>>");
//        String s =  scanner.nextLine();
        int n = scanner.nextInt();
        int a, b;
        a = n / 10;
        b = n % 10;
        if(n != 0)
            if (a % 3 == 0 || b % 3 == 0)
                System.out.print("박수");
        if (a % 3 == 0 && a != 0)
            System.out.print("짝");
        if (b % 3 == 0 && b != 0)
            System.out.print("짝");*/
//        if(s.contains("3") || s.contains("6") || s.contains("9")){
//            System.out.println("박수짝");
//        }

//        System.out.print("중간 값은 ");
//
//        if( a > b && a > c){
//            if(b > c)
//                System.out.println(b);
//            else
//                System.out.println(c);
//        }
//
//        else if(b > a && b > c) {
//            if (a > c)
//                System.out.println(a);
//            else
//                System.out.println(c);
//        }
//        else{
//            if(a>b)
//                System.out.println(a);
//            else
//                System.out.println(b);
//        }

/*        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();

        switch(in){
            case "가위":
                System.out.println(1);
                break;
            case "바위":
                System.out.println(2);
                break;
            case "보":
                System.out.println(3);
            default:
                System.out.println(0);
            break;
        }*/
/*
        if (in.equals("가위"))

            System. out.println(1);

        else if( in.equals("바위"))

            System. out.println(2);

        else if( in.equals("보"))

            System. out.println(3);

        else

            System. out.println(0);*/
    }
}