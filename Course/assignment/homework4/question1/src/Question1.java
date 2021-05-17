import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <='z')
                System.out.printf("%c",s.charAt(i)-32);
            else if (s.charAt(i) >= 'A' && s.charAt(i) <='Z')
                System.out.printf("%c",s.charAt(i)+32);
            else
                System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}