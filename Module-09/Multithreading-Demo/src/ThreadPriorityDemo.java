class PriorityThread extends Thread {
    public PriorityThread(String name){
        super(name);
    }

    @Override
    public void run() {
        // Thread task should be with run methods
        System.out.println(getName() +" Priority: "+ getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Low");
        PriorityThread t2 = new PriorityThread("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }

}
