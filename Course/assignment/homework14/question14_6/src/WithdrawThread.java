public class WithdrawThread implements Runnable {
    private Account account;

    public WithdrawThread(Account account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(5000);
    }
}
