//public class MyThread extends Thread{
public class MyThread implements Runnable{
    private int threadId;

    public MyThread(int threadId){
        this.threadId = threadId;
    }

    public void run(){
        for(int i=1;i<=7;i++){
            System.out.println(threadId+"번 쓰레드:" + i);

            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(threadId + "번 쓰레드 업무 종료");
    }
}
