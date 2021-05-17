import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        String[] subjectNames = {"SP","JP","EN","DS","AL"};
        int[] subjectScores = new int[5];
        Scanner scanner = new Scanner(System.in);
        int score;
        int i;
        for(i=0; i<subjectScores.length; i++){
            System.out.print("과목: " + subjectNames[i] + "의 점수: ");
            score = scanner.nextInt();
            subjectScores[i] = score;
        }

        System.out.println("\n-- 점수 출력 --");
        for (i=0 ;i<subjectScores.length;i++) {
            System.out.println(subjectNames[i] + ": " + subjectScores[i]);
        }
    }
}

