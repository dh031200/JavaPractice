import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        GenStack<Movie> movieGenStack = new GenStack(3);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. push");
            System.out.println("2. all pop");
            System.out.println("3. exit");
            int C = scanner.nextInt();
            scanner.nextLine();
            if (C == 1) {
                System.out.print("> 영화 제목: ");
                String title = scanner.nextLine();
                System.out.print("> 개봉 연도: ");
                int year = scanner.nextInt();
                System.out.print("> 영화 평점: ");
                double grade = scanner.nextDouble();
                try {
                    if (movieGenStack.isFull())
                        throw new Exception("스택이 가득 찼습니다!");
                    movieGenStack.push(new Movie(title, year, grade));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (C == 2) {
                while (!movieGenStack.isEmpty())
                    System.out.println(movieGenStack.pop());
            } else if (C == 3) {
                break;
            }
        }
    }
}
