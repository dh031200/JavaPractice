public class DepositThread implements Runnable {
    private Account account;

    public DepositThread(Account account) {
        this.account = account;
    }

    public void run() {
        account.deposit(7000);
    }
}
