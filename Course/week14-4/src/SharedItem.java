public class SharedItem {
    private int data;
    private boolean isConsumed;

    public SharedItem() {
        isConsumed = true;
    }

    public synchronized void put(int data){
        while(!isConsumed){
            try{
                wait();
            }catch (InterruptedException e){}
        }
        isConsumed = false;
        this.data = data;
        notify();
    }

    public synchronized int get(){
        while (isConsumed){
            try{
                wait();
            }catch (InterruptedException e) {}
        }
        isConsumed = true;
        notify();
        return data;
    }
}
