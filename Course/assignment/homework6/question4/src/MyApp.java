public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        String[] subjectNames = {"SP", "JP", "EN", "DS"};
        int[][] subjectScores = {{100, 100, 100, 100}, {50, 20, 30, 40}, {30, 30, 30, 30}};
        int i, j;

        for (i=0; i< subjectScores.length; i++) {
            System.out.println("학생" + i);
            for (j=0; j<subjectScores[i].length; j++) {
                System.out.println(subjectNames[j] + " 점수: " + subjectScores[i][j]);
            }
        }
    }

}

