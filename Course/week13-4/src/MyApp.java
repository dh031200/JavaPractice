import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentHashMap studentHashMap = new StudentHashMap();

        while(true){
            System.out.println("1. 학생 목록");
            System.out.println("2. 학생 추가");
            System.out.println("3. 학생 검색");
            System.out.println("4. 종료");
            System.out.print("> ");
            int i = scanner.nextInt();
            if (i == 1)
                studentHashMap.printInformation();
            else if (i == 2)
                studentHashMap.addStudent();
            else if (i==3)
                studentHashMap.searchStudent();
            else if (i==4)
                break;
        }
    }
}
