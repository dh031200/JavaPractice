public class MyApp {
    public static void main(String[] args) {
//        String[] subjectNames = {"국어", "영어", "수학", "사회", "과학"};
//        int[] subjectScores = new int[5];
//
//        subjectScores[0] = 100;
//        subjectScores[1] = 50;
//        subjectScores[2] = 10;
//        subjectScores[3] = 70;
//        subjectScores[4] = 80;
//
//        System.out.println("> int 배열의 길이: " + subjectScores.length);
//        for (int i = 0; i < subjectScores.length; i++)
//            System.out.println(subjectNames[i] + ": " + subjectScores[i]);
//
//        System.out.println(subjectNames[3] + "과목 수정, 기존 점수: " + subjectScores[3]);
//        modifyScore(subjectScores, 3);
//        System.out.println(subjectNames[3] + "과목 수정, 수정 후 점수: " + subjectScores[3]);

        String[] subjectNames = {"영어", "과학", "수학", "사회"};

    }

    public static void modifyScore(int[] scores, int index) {
        scores[index] += 10;

    }
}
