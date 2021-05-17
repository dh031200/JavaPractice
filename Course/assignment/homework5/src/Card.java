public class Card {
    int num;
    String kind;
    Card(int num, String kind){
        this.num = num;
        this.kind = kind;
    }
    public void printCard(){
        System.out.print(this.kind + ": " + this.num);
    }

    public int getNum() {
        return num;
    }
}
