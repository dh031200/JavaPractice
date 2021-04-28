public class Movie {
    private String title;
    private double grade;

    public Movie(String title, double grade){
        this.title = title;
        this.grade = grade;
    }

    public void printInformation(){
        System.out.println("---- 영화 정보 ----");
        System.out.println("> 제목: "+this.title);
        System.out.println("> 평점: "+this.grade);
        System.out.println("------------------");
    }

    public String getTitle() {
        return title;
    }

    public double getGrade() {
        return grade;
    }
}
