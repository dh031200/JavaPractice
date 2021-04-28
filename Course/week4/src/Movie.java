public class Movie {
    private String title;
    private String director;
    private int runningTime;
    private int releaseYear;
    private int grade;

    public Movie(){}

    public Movie(String title, String director, int runningTime, int releaseYear, int grade) {
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
        this.releaseYear = releaseYear;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void printInformation(){
        System.out.println("----- 영화 정보 출력-----");
        System.out.println("> 제목: " + this.title);
        System.out.println("> 개봉 연도: " + this.releaseYear);
        System.out.println("-----------------------");
    }
}
