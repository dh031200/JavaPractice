public class Card {
    private String kind;
    private int number;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public void printCard(){
        System.out.println(this.kind + ": " + this.number);
    }
}
