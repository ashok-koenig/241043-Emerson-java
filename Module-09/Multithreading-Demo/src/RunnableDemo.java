class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread Task is running...");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("The main thread starts");

        Thread t1 = new Thread(new MyTask());
        t1.start();

        System.out.println("The main thread ends");
    }
}
