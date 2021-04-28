public class Theater {
    private int row;
    private int col;
    private boolean [][] seats;
    private int remainingSeats;
    private Movie movie;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Theater(int row, int col){
        this.row = row;
        this.col = col;
        this.seats = new boolean[row][col];
        this.remainingSeats = row * col;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                this.seats[i][j] = false;
            }
        }
    }

    public void printSeats(){
        //todo 좌석출력
    }

    public void book(int row, int col){

    }
}
