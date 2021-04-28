public class MyApp {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.printInformation();

        movie.setTitle("Aladdin");
        movie.setReleaseYear(2019);
        movie.printInformation();

        System.out.println("-- Getter --");
        System.out.println(">> 제목: " + movie.getTitle());
        System.out.println(">> 개봉년도: " + movie.getReleaseYear());
}
}
