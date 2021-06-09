public class MyApp {
    public static void main(String[] args) {
        System.out.println("2015270434 김동훈");
        Account account = new Account("DH", 20000);
        account.printInfo();
        Thread t1 = new Thread(new DepositThread(account));
        Thread t2 = new Thread(new WithdrawThread(account));
        Thread t3 = new Thread(new WithdrawThread(account));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("모든 쓰레드 종료");
        account.printInfo();
    }
}
