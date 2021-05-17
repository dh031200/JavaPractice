public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        String[] subjectNames = {"SP","JP","EN","DS","AL"};
        int[] subjectScores = new int[5];
        int i;

        subjectScores[0] = 20;
        subjectScores[1] = 30;
        subjectScores[2] = 40;
        subjectScores[3] = 50;
        subjectScores[4] = 60;

        System.out.println("-- 점수 출력 --");
        for (i=0; i< subjectScores.length; i++) {
            System.out.println(subjectNames[i] + ": " + subjectScores[i]);
        }

        System.out.println(subjectNames[3] + " 과목 점수 수정, 기존 점수: " + subjectScores[3]);
        modifyScore(subjectScores,3);
        System.out.println(subjectNames[3] + " 과목 점수 수정, 수정 후 점수: " + subjectScores[3]);
    }

    private static void modifyScore(int[] scores, int index) {
        scores[index] += 10;
    }
}
