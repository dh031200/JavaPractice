public class DepositThread implements Runnable{
    private Account account;

    public DepositThread(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(3000);
    }
}
