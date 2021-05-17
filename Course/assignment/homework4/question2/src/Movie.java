public class Movie {
    public static int movieCount = 0;
    private String title;
    private String director;
    private int runningTime;
    private int releaseYear;
    private int grade;

    public static int getMovieCount(){
        return movieCount;
    }

    public Movie() {
        movieCount++;
    }

    public Movie(String title, String director, int runningTime, int releaseYear, int grade) {
        System.out.println("생성자를 이용하여 movie 객체 생성 및 초기화");
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
        this.releaseYear = releaseYear;
        this.grade = grade;
        movieCount++;
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
        System.out.println("------ 영화 정보 ------");
        System.out.println("> 제목: " + this.title);
        System.out.println("> 감독: " + this.director);
        System.out.println("> 상영시간: " + this.runningTime + "분");
        System.out.println("> 개봉연도: " + this.releaseYear + "년");
        System.out.println("> 평점: " + this.grade + "점");
        System.out.println("----------------------");
    }
}
