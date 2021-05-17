public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        String[] subjectNames = {"SP","JP","EN","DS","AL"};
        int[] subjectScores = new int[5];

        subjectScores[0] = 100;
        subjectScores[1] = 70;
        subjectScores[2] = 60;
        subjectScores[3] = 50;
        subjectScores[4] = 80;

        System.out.println("> int 배열의 길이: " + subjectScores.length);
        System.out.println("> String 배열의 길이: " + subjectNames.length);
        for (int i=0; i<subjectScores.length;i++) {
            System.out.println(subjectNames[i] + ": " + subjectScores[i]);
        }
    }
}

