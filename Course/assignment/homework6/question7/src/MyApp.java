import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");

        MovieList movieList = new MovieList(3);
        Scanner scanner = new Scanner(System.in);
        String title;
        int year;
        double grade;

        for (int i=0; i<3;i++) {
            System.out.println("--- 영화 정보 입력 ---");
            System.out.print("> 영화 제목: ");
            title = scanner.nextLine();
            System.out.print("> 개봉 연도: ");
            year = scanner.nextInt();
            System.out.print("> 평점: ");
            grade = scanner.nextDouble();
            movieList.writeInfo(i, title, year, grade);
            scanner.nextLine();
        }

        for(int i=0; i<3; i++){
            movieList.printInfoWithIndex(i);
        }

        System.out.println();
        movieList.printAll();
    }
}
