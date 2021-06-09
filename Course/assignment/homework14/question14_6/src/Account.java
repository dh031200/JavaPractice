public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        int temp = balance;
        temp += amount;
        balance = temp;
    }

    public synchronized void withdraw(int amount) {
        int temp = balance;
        temp -= amount;
        balance = temp;
    }

    public void printInfo() {
        System.out.println(name + " 계좌 잔액: " + balance + "원");
    }
}
