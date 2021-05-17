public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        MovieList movieList = new MovieList(3);

        movieList.writeInfo(0,"Aladdin",2020,4.5);
        movieList.writeInfo(1,"lala",2016,4);
        movieList.writeInfo(2,"endgame",2018,4);

        for (int i=0; i<3; i++) {
            movieList.printInfoWithIndex(i);
        }
        System.out.println();
        movieList.printAll();
    }
}
