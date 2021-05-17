public class MovieList {
    private Movie[] movieList;

    public MovieList(int size){
        movieList = new Movie[size];
    }

    public void writeInfo(int index, String title, int releaseYear, double grade){
        movieList[index] = new Movie(title, releaseYear, grade);
    }

    public void printInfoWithIndex(int index){
        movieList[index].printInformation();
    }

    public void printAll(){
        System.out.println("----- print All -----");
        for (Movie movie : movieList) {
            movie.printInformation();
        }
    }
}