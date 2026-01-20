class Worker extends Thread{
    public Worker(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=1; i<=3 ;i++){
            System.out.println(getName() + " running task - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker t1 = new Worker("Worker-1");
        Worker t2 = new Worker("Worker-2");

        t1.start();
        t1.join(); // wait for t1 thread to complete
        t2.start();
    }
}
