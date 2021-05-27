import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {
    private HashMap<Integer, String> hashMap;
    private Scanner scanner;

    public StudentHashMap(){
        hashMap = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void printInformation(){
        for (Integer key: hashMap.keySet())
            System.out.println("학번_" + key + ", 이름_" + hashMap.get(key));
    }

    public void searchStudent(){
        System.out.println("> 학번: ");
        Integer num = scanner.nextInt();
        if(hashMap.containsKey(num))
            System.out.println("학번_" + num + ", 이름_" + hashMap.get(num));
        else
            System.out.println(num + " Not Found");
    }

    public void addStudent(){
        System.out.print("> 학번: ");
        Integer num = scanner.nextInt();
        System.out.print("> 이름: ");
        String name = scanner.next();
        hashMap.put(num, name);
    }
}