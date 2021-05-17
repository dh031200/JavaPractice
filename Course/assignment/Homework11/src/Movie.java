public class Movie {
    private String title;
    private int releaseYear;
    private double grade;

    public Movie(String title, int releaseYear, double grade) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.grade = grade;
    }

    public String toString() {
        return title;
    }

    public String getInformation(){
        return "------ 영화 정보 ------\n" + "> 제목: " + title + "\n> 개봉연도: " + releaseYear + "\n> 평점: " + grade + "\n---------------------";
    }
}
