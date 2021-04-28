import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        Theater theater = new Theater(7,7);
        Movie movie = new Movie("find", 4.5);
        theater.setMovie(movie);
        theater.setCol(3);

        while(true){
            theater.printSeats();
            System.out.println("> 예매하려고 하는 좌석 입력(행, 열)(-1 입력시 종료): ");
            row = sc.nextInt();
            col = sc.nextInt();
            if(row == 1 || col == 1)
                break;

            theater.book(row, col);

        }
    }
}
