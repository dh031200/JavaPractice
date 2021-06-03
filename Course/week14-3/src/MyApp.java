public class MyApp {
    public static void main(String[] args) {
//        Number number = new Number(0);
//        Thread[] thread = new Thread[50];
//
//        for(int i=0; i<50; i++) {
//            thread[i] = new Thread(new CountingThread(number, i));
//            thread[i].start();
//        }
//
//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//        System.out.println("result: " + number.getNum());

        Account account = new Account("dh", 20000);
        account.printAccount();
        Thread t1 = new Thread(new DepositThread(account));
        Thread t2 = new Thread(new WithdrawThread(account));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        account.printAccount();
    }
}
