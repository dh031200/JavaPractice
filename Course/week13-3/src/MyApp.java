import java.util.HashSet;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("바나나");
        fruitSet.add("포도");
        fruitSet.add("오렌지");
        fruitSet.add("사과");
        fruitSet.add("포도");

        System.out.println("-- 과일 목록 --");
        for (String fruit : fruitSet)
            System.out.println(fruit);

        Scanner scanner = new Scanner(System.in);
        System.out.print("> 과일 이름 입력: ");
        String name = scanner.nextLine();
        String result = fruitSet.contains(name) ? " Found" : " Not Found";
        System.out.println(name + result);

    }
}
