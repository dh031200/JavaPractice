import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        Scanner scanner = new Scanner(System.in);
        int row, col;
        Bus bus = new Bus(10,4);
        while(true){
            bus.printSeats();
            System.out.print("> 예매하고 싶은 좌석 입력(-1 입력시 종료): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if(row == -1 || col == -1)
                break;

            row -= 1;
            col -= 1;
            bus.book(row,col);
            System.out.println();
        }
    }
}
