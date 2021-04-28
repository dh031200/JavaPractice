import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kind = {"Spade", "Heart", "Clover", "Diamond"};
        int i;
        System.out.println("== start ==");
        while (true){
            System.out.println("--------");
            System.out.println("1. 카드 뽑기");
            System.out.println("2. 종료");
            System.out.println("--------");

            System.out.print("> ");
            i =scanner.nextInt();

            if(i == 1){
                new Card(kind[(int)(Math.random()*4)],(int)(Math.random()*13)+1).printCard();
            }
            else if(i == 2)
                break;
            else{
                System.out.println("Wrong input");
            }
        }
    }
}
