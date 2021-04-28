import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        String str = "Hello World!";
        System.out.println(str);

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("Upper Case: " + str.toUpperCase());

        str = "hello java programming";
        System.out.println("str length: " + str.length());

        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,8));

        int index = str.indexOf("java");
        System.out.println("\"java\" in str: " + index);
        System.out.println("\"Java\" in str: " + str.indexOf("JAVA"));

        System.out.println(str.equals("hello java programming"));
        System.out.println(str.equals("hello java Programming"));
        System.out.println(str.equalsIgnoreCase("hello java Programming"));

        System.out.print("> ");
        input = scanner.nextLine();
        System.out.println(input + "!");
        System.out.println(str.equals(input));
        System.out.println(str.equals(input.trim()));
    }
}
