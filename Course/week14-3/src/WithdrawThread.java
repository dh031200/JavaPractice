public class WithdrawThread implements Runnable{
    private Account account;

    public WithdrawThread(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(10000);
    }
}
