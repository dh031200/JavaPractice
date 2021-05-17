public class Movie {

    private String title;
    private int releaseYear;
    private double grade;

    public Movie(String title, int releaseYear, double grade) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.grade = grade;
    }

    public void printInformation() {

        System.out.println("----- 영화 정보 -----");
        System.out.println("> 제목: " + this.title);
        System.out.println("> 개봉연도: " + this.releaseYear + "년");
        System.out.println("> 평점: " + this.grade + "점");
        System.out.println("--------------------");
    }
}
