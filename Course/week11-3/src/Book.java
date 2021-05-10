public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getFullInfo(){
        return "책 제목: " + title + "\n저자: " + author + "\n가격: " + price;
    }

    public String toString(){
        return title;
    }
}
