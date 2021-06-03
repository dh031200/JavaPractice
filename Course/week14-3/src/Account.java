public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized void deposit(int amount){
        int tmp = balance;
        tmp -= amount;
        balance = tmp;
//        balance += amount;
    }

    public synchronized void withdraw(int amount){
        int tmp = balance;
        tmp += amount;
        balance = tmp;
    }

    public void printAccount(){
        System.out.println(name + " 계좌 잔액: " + balance + "원");
    }
}
