import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        System.out.println("== start ==");
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true){
            Choice();
            input = scanner.nextInt();
            if(input == 1){
                Card card_1 = selectOne();
                Card card_2 = selectOne();
                card_1.printCard();
                System.out.println();
                card_2.printCard();
                System.out.println();
                CompareCard(card_1, card_2);
            }
            else if(input == 2){
                System.out.println("== end ==");
                break;
            }
            else{
                System.out.println("Wrong input!");
            }
        }
    }

    public static Card selectOne(){
        final String[] kind = {"Heart", "Spade", "Diamond", "club"};
        int randNumber = (int)(Math.random()*13)+1;
        int randKind = (int)(Math.random() * 4);
        return new Card(randNumber,kind[randKind]);
    }

    public static void Choice(){
        System.out.println("----------");
        System.out.println("1. Game");
        System.out.println("2. 종료");
        System.out.println("----------");
        System.out.print("> ");
    }
    public static void  CompareCard(Card a, Card b){
        if(a.getNum() > b.getNum()) {
            a.printCard();
            System.out.println(" win!");
        }
        else if(a.getNum() < b.getNum()) {
            b.printCard();
            System.out.println(" win!");
        }
        else
            System.out.println("draw");
    }
}
